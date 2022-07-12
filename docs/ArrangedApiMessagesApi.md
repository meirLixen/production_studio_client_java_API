# ArrangedApiMessagesApi

All URIs are relative to *http://{{url}}*

Method | HTTP request | Description
------------- | ------------- | -------------
[**newApiChatCheckUnreadChatsGet**](ArrangedApiMessagesApi.md#newApiChatCheckUnreadChatsGet) | **GET** /new-api/chat/check-unread-chats | get unread messages number
[**newApiChatMessagePost**](ArrangedApiMessagesApi.md#newApiChatMessagePost) | **POST** /new-api/chat/message | create message
[**newApiChatReadChatMessagesGet**](ArrangedApiMessagesApi.md#newApiChatReadChatMessagesGet) | **GET** /new-api/chat/read-chat-messages | set all chat messages as read messages

<a name="newApiChatCheckUnreadChatsGet"></a>
# **newApiChatCheckUnreadChatsGet**
> newApiChatCheckUnreadChatsGet()

get unread messages number

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ArrangedApiMessagesApi;


ArrangedApiMessagesApi apiInstance = new ArrangedApiMessagesApi();
try {
    apiInstance.newApiChatCheckUnreadChatsGet();
} catch (ApiException e) {
    System.err.println("Exception when calling ArrangedApiMessagesApi#newApiChatCheckUnreadChatsGet");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="newApiChatMessagePost"></a>
# **newApiChatMessagePost**
> newApiChatMessagePost(body)

create message

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ArrangedApiMessagesApi;


ArrangedApiMessagesApi apiInstance = new ArrangedApiMessagesApi();
Object body = null; // Object | 
try {
    apiInstance.newApiChatMessagePost(body);
} catch (ApiException e) {
    System.err.println("Exception when calling ArrangedApiMessagesApi#newApiChatMessagePost");
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

<a name="newApiChatReadChatMessagesGet"></a>
# **newApiChatReadChatMessagesGet**
> newApiChatReadChatMessagesGet(chatId)

set all chat messages as read messages

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ArrangedApiMessagesApi;


ArrangedApiMessagesApi apiInstance = new ArrangedApiMessagesApi();
String chatId = "chatId_example"; // String | 
try {
    apiInstance.newApiChatReadChatMessagesGet(chatId);
} catch (ApiException e) {
    System.err.println("Exception when calling ArrangedApiMessagesApi#newApiChatReadChatMessagesGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **chatId** | **String**|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

