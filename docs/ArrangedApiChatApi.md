# ArrangedApiChatApi

All URIs are relative to *http://{{url}}*

Method | HTTP request | Description
------------- | ------------- | -------------
[**apiConversationGet**](ArrangedApiChatApi.md#apiConversationGet) | **GET** /api/conversation | get or create chat by users list

<a name="apiConversationGet"></a>
# **apiConversationGet**
> apiConversationGet(u)

get or create chat by users list

Receive the call with all messages and set all messages as read messages

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ArrangedApiChatApi;


ArrangedApiChatApi apiInstance = new ArrangedApiChatApi();
String u = "u_example"; // String | 
try {
    apiInstance.apiConversationGet(u);
} catch (ApiException e) {
    System.err.println("Exception when calling ArrangedApiChatApi#apiConversationGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **u** | **String**|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

