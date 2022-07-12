# ArrangedApiJobConversationApi

All URIs are relative to *http://{{url}}*

Method | HTTP request | Description
------------- | ------------- | -------------
[**newApiJobSendMessageJobConversationPost**](ArrangedApiJobConversationApi.md#newApiJobSendMessageJobConversationPost) | **POST** /new-api/job/send-message-job-conversation | send-message-job-conversation

<a name="newApiJobSendMessageJobConversationPost"></a>
# **newApiJobSendMessageJobConversationPost**
> newApiJobSendMessageJobConversationPost(body)

send-message-job-conversation

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ArrangedApiJobConversationApi;


ArrangedApiJobConversationApi apiInstance = new ArrangedApiJobConversationApi();
Object body = null; // Object | 
try {
    apiInstance.newApiJobSendMessageJobConversationPost(body);
} catch (ApiException e) {
    System.err.println("Exception when calling ArrangedApiJobConversationApi#newApiJobSendMessageJobConversationPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Object**](Object.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

