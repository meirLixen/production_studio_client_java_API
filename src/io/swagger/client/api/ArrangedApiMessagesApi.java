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

import io.swagger.client.ApiCallback;
import io.swagger.client.ApiClient;
import io.swagger.client.ApiException;
import io.swagger.client.ApiResponse;
import io.swagger.client.Configuration;
import io.swagger.client.Pair;
import io.swagger.client.ProgressRequestBody;
import io.swagger.client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;



import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ArrangedApiMessagesApi {
    private ApiClient __apiClient;

    public ArrangedApiMessagesApi() {
        this(Configuration.getDefaultApiClient());
    }

    public ArrangedApiMessagesApi(ApiClient apiClient) {
        this.__apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return __apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.__apiClient = apiClient;
    }

    /**
     * Build call for newApiChatCheckUnreadChatsGet
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call newApiChatCheckUnreadChatsGetCall(final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object __localVarPostBody = null;
        
        // create path and map variables
        String __localVarPath = "/new-api/chat/check-unread-chats";

        List<Pair> __localVarQueryParams = new ArrayList<Pair>();
        List<Pair> __localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> __localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> __localVarFormParams = new HashMap<String, Object>();

        final String[] __localVarAccepts = {
            "application/json"
        };
        final String __localVarAccept = __apiClient.selectHeaderAccept(__localVarAccepts);
        if (__localVarAccept != null) __localVarHeaderParams.put("Accept", __localVarAccept);

        final String[] __localVarContentTypes = {
            
        };
        final String __localVarContentType = __apiClient.selectHeaderContentType(__localVarContentTypes);
        __localVarHeaderParams.put("Content-Type", __localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] __localVarAuthNames = new String[] {  };
        return __apiClient.buildCall(__localVarPath, "GET", __localVarQueryParams, __localVarCollectionQueryParams, __localVarPostBody, __localVarHeaderParams, __localVarFormParams, __localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call newApiChatCheckUnreadChatsGetValidateBeforeCall(final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        com.squareup.okhttp.Call __call = newApiChatCheckUnreadChatsGetCall(progressListener, progressRequestListener);
        return __call;

        
        
        
        
    }

    /**
     * get unread messages number
     * 
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void newApiChatCheckUnreadChatsGet() throws ApiException {
        newApiChatCheckUnreadChatsGetWithHttpInfo();
    }

    /**
     * get unread messages number
     * 
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> newApiChatCheckUnreadChatsGetWithHttpInfo() throws ApiException {
        com.squareup.okhttp.Call __call = newApiChatCheckUnreadChatsGetValidateBeforeCall(null, null);
        return __apiClient.execute(__call);
    }

    /**
     * get unread messages number (asynchronously)
     * 
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call newApiChatCheckUnreadChatsGetAsync(final ApiCallback<Void> __callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call __call = newApiChatCheckUnreadChatsGetValidateBeforeCall(progressListener, progressRequestListener);
        __apiClient.executeAsync(__call, __callback);
        return __call;
    }
    /**
     * Build call for newApiChatMessagePost
     * @param body  (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call newApiChatMessagePostCall(Object body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object __localVarPostBody = body;
        
        // create path and map variables
        String __localVarPath = "/new-api/chat/message";

        List<Pair> __localVarQueryParams = new ArrayList<Pair>();
        List<Pair> __localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> __localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> __localVarFormParams = new HashMap<String, Object>();

        final String[] __localVarAccepts = {
            "application/json"
        };
        final String __localVarAccept = __apiClient.selectHeaderAccept(__localVarAccepts);
        if (__localVarAccept != null) __localVarHeaderParams.put("Accept", __localVarAccept);

        final String[] __localVarContentTypes = {
            "application/json"
        };
        final String __localVarContentType = __apiClient.selectHeaderContentType(__localVarContentTypes);
        __localVarHeaderParams.put("Content-Type", __localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] __localVarAuthNames = new String[] {  };
        return __apiClient.buildCall(__localVarPath, "POST", __localVarQueryParams, __localVarCollectionQueryParams, __localVarPostBody, __localVarHeaderParams, __localVarFormParams, __localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call newApiChatMessagePostValidateBeforeCall(Object body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        com.squareup.okhttp.Call __call = newApiChatMessagePostCall(body, progressListener, progressRequestListener);
        return __call;

        
        
        
        
    }

    /**
     * create message
     * 
     * @param body  (optional)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void newApiChatMessagePost(Object body) throws ApiException {
        newApiChatMessagePostWithHttpInfo(body);
    }

    /**
     * create message
     * 
     * @param body  (optional)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> newApiChatMessagePostWithHttpInfo(Object body) throws ApiException {
        com.squareup.okhttp.Call __call = newApiChatMessagePostValidateBeforeCall(body, null, null);
        return __apiClient.execute(__call);
    }

    /**
     * create message (asynchronously)
     * 
     * @param body  (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call newApiChatMessagePostAsync(Object body, final ApiCallback<Void> __callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call __call = newApiChatMessagePostValidateBeforeCall(body, progressListener, progressRequestListener);
        __apiClient.executeAsync(__call, __callback);
        return __call;
    }
    /**
     * Build call for newApiChatReadChatMessagesGet
     * @param chatId  (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call newApiChatReadChatMessagesGetCall(String chatId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object __localVarPostBody = null;
        
        // create path and map variables
        String __localVarPath = "/new-api/chat/read-chat-messages";

        List<Pair> __localVarQueryParams = new ArrayList<Pair>();
        List<Pair> __localVarCollectionQueryParams = new ArrayList<Pair>();
        if (chatId != null)
        __localVarQueryParams.addAll(__apiClient.parameterToPair("chatId", chatId));

        Map<String, String> __localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> __localVarFormParams = new HashMap<String, Object>();

        final String[] __localVarAccepts = {
            "application/json"
        };
        final String __localVarAccept = __apiClient.selectHeaderAccept(__localVarAccepts);
        if (__localVarAccept != null) __localVarHeaderParams.put("Accept", __localVarAccept);

        final String[] __localVarContentTypes = {
            
        };
        final String __localVarContentType = __apiClient.selectHeaderContentType(__localVarContentTypes);
        __localVarHeaderParams.put("Content-Type", __localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] __localVarAuthNames = new String[] {  };
        return __apiClient.buildCall(__localVarPath, "GET", __localVarQueryParams, __localVarCollectionQueryParams, __localVarPostBody, __localVarHeaderParams, __localVarFormParams, __localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call newApiChatReadChatMessagesGetValidateBeforeCall(String chatId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        com.squareup.okhttp.Call __call = newApiChatReadChatMessagesGetCall(chatId, progressListener, progressRequestListener);
        return __call;

        
        
        
        
    }

    /**
     * set all chat messages as read messages
     * 
     * @param chatId  (optional)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void newApiChatReadChatMessagesGet(String chatId) throws ApiException {
        newApiChatReadChatMessagesGetWithHttpInfo(chatId);
    }

    /**
     * set all chat messages as read messages
     * 
     * @param chatId  (optional)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> newApiChatReadChatMessagesGetWithHttpInfo(String chatId) throws ApiException {
        com.squareup.okhttp.Call __call = newApiChatReadChatMessagesGetValidateBeforeCall(chatId, null, null);
        return __apiClient.execute(__call);
    }

    /**
     * set all chat messages as read messages (asynchronously)
     * 
     * @param chatId  (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call newApiChatReadChatMessagesGetAsync(String chatId, final ApiCallback<Void> __callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call __call = newApiChatReadChatMessagesGetValidateBeforeCall(chatId, progressListener, progressRequestListener);
        __apiClient.executeAsync(__call, __callback);
        return __call;
    }
}
