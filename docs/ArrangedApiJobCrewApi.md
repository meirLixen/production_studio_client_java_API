# ArrangedApiJobCrewApi

All URIs are relative to *http://{{url}}*

Method | HTTP request | Description
------------- | ------------- | -------------
[**apiOfferConfirmGet**](ArrangedApiJobCrewApi.md#apiOfferConfirmGet) | **GET** /api/offer-confirm | get job crew
[**apiOfferConfirmPatch**](ArrangedApiJobCrewApi.md#apiOfferConfirmPatch) | **PATCH** /api/offer-confirm | fatch offer crew
[**apiOfferConfirmPost**](ArrangedApiJobCrewApi.md#apiOfferConfirmPost) | **POST** /api/offer-confirm | create job crew

<a name="apiOfferConfirmGet"></a>
# **apiOfferConfirmGet**
> apiOfferConfirmGet(job)

get job crew

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ArrangedApiJobCrewApi;


ArrangedApiJobCrewApi apiInstance = new ArrangedApiJobCrewApi();
String job = "job_example"; // String | 
try {
    apiInstance.apiOfferConfirmGet(job);
} catch (ApiException e) {
    System.err.println("Exception when calling ArrangedApiJobCrewApi#apiOfferConfirmGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **job** | **String**|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="apiOfferConfirmPatch"></a>
# **apiOfferConfirmPatch**
> apiOfferConfirmPatch(body)

fatch offer crew

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ArrangedApiJobCrewApi;


ArrangedApiJobCrewApi apiInstance = new ArrangedApiJobCrewApi();
Object body = null; // Object | 
try {
    apiInstance.apiOfferConfirmPatch(body);
} catch (ApiException e) {
    System.err.println("Exception when calling ArrangedApiJobCrewApi#apiOfferConfirmPatch");
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

<a name="apiOfferConfirmPost"></a>
# **apiOfferConfirmPost**
> apiOfferConfirmPost(body)

create job crew

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ArrangedApiJobCrewApi;


ArrangedApiJobCrewApi apiInstance = new ArrangedApiJobCrewApi();
Object body = null; // Object | 
try {
    apiInstance.apiOfferConfirmPost(body);
} catch (ApiException e) {
    System.err.println("Exception when calling ArrangedApiJobCrewApi#apiOfferConfirmPost");
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

