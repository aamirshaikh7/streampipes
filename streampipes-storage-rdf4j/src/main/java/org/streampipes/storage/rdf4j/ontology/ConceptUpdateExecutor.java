/*
 * Copyright 2018 FZI Forschungszentrum Informatik
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */

package org.streampipes.storage.rdf4j.ontology;

import org.eclipse.rdf4j.query.MalformedQueryException;
import org.eclipse.rdf4j.query.QueryEvaluationException;
import org.eclipse.rdf4j.query.UpdateExecutionException;
import org.eclipse.rdf4j.repository.Repository;
import org.eclipse.rdf4j.repository.RepositoryException;
import org.streampipes.model.client.ontology.Concept;
import org.streampipes.storage.rdf4j.sparql.QueryBuilder;

public class ConceptUpdateExecutor extends UpdateExecutor {

	private Concept concept;
	
	public ConceptUpdateExecutor(Repository repository, Concept concept) {
		super(repository);
		this.concept = concept;
	}

	@Override
	public void deleteExistingTriples() throws RepositoryException,
					QueryEvaluationException, MalformedQueryException,
					UpdateExecutionException {
		executeUpdate(QueryBuilder.deleteConceptDetails(concept.getElementHeader().getId()));
	}

	@Override
	public void addNewTriples() throws RepositoryException,
			QueryEvaluationException, MalformedQueryException,
			UpdateExecutionException {
		executeUpdate(QueryBuilder.addConceptDetails(concept));
	}

}
