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
 * API tests for ArrangedApiChatApi
 */
@Ignore
public class ArrangedApiChatApiTest {

    private final ArrangedApiChatApi api = new ArrangedApiChatApi();

    /**
     * get or create chat by users list
     *
     * Receive the call with all messages and set all messages as read messages
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void apiConversationGetTest() throws ApiException {
        String u = null;
        api.apiConversationGet(u);

        // TODO: test validations
    }
}
