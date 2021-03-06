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
 * API tests for ArrangedApiMessagesApi
 */
@Ignore
public class ArrangedApiMessagesApiTest {

    private final ArrangedApiMessagesApi api = new ArrangedApiMessagesApi();

    /**
     * get unread messages number
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void newApiChatCheckUnreadChatsGetTest() throws ApiException {
        api.newApiChatCheckUnreadChatsGet();

        // TODO: test validations
    }
    /**
     * create message
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void newApiChatMessagePostTest() throws ApiException {
        Object body = null;
        api.newApiChatMessagePost(body);

        // TODO: test validations
    }
    /**
     * set all chat messages as read messages
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void newApiChatReadChatMessagesGetTest() throws ApiException {
        String chatId = null;
        api.newApiChatReadChatMessagesGet(chatId);

        // TODO: test validations
    }
}
