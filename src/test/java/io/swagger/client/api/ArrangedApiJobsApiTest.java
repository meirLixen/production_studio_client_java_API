/*
 * production-studio API
 * This is a REST API application made with Express.
 *
 * OpenAPI spec version: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.swagger.client.api;

import io.swagger.client.ApiException;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ArrangedApiJobsApi
 */
@Ignore
public class ArrangedApiJobsApiTest {

    private final ArrangedApiJobsApi api = new ArrangedApiJobsApi();

    /**
     * delete job
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void apiJobOfferDeleteTest() throws ApiException {
        String id = null;
        api.apiJobOfferDelete(id);

        // TODO: test validations
    }
    /**
     * get jobs
     *
     * If you want to get a job offer by ID Add ID param.   Otherwise if you want to get a list of job offers by type Add TYPE param.    Type options:  1.  offers 2.  my 3.  made 4.  crew 5.  received
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void apiJobOfferGetTest() throws ApiException {
        api.apiJobOfferGet();

        // TODO: test validations
    }
    /**
     * fatch job
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void apiJobOfferPatchTest() throws ApiException {
        Object body = null;
        api.apiJobOfferPatch(body);

        // TODO: test validations
    }
    /**
     * create job
     *
     * *   Create new job in \&quot;jobs\&quot; table *   Look for professionals *   Update professionals found: push job id to jobOffers array in USERS table and email them
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void apiJobOfferPostTest() throws ApiException {
        Object body = null;
        api.apiJobOfferPost(body);

        // TODO: test validations
    }
}
