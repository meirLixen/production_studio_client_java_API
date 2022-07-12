# ArrangedApiJobPriceOffersApi

All URIs are relative to *http://{{url}}*

Method | HTTP request | Description
------------- | ------------- | -------------
[**apiJobPriceOfferDelete**](ArrangedApiJobPriceOffersApi.md#apiJobPriceOfferDelete) | **DELETE** /api/job-price-offer | delete job price offer
[**apiJobPriceOfferGet**](ArrangedApiJobPriceOffersApi.md#apiJobPriceOfferGet) | **GET** /api/job-price-offer | get job price offer
[**apiJobPriceOfferPatch**](ArrangedApiJobPriceOffersApi.md#apiJobPriceOfferPatch) | **PATCH** /api/job-price-offer | fatch job price offer
[**apiJobPriceOfferPost**](ArrangedApiJobPriceOffersApi.md#apiJobPriceOfferPost) | **POST** /api/job-price-offer | create job price offer

<a name="apiJobPriceOfferDelete"></a>
# **apiJobPriceOfferDelete**
> apiJobPriceOfferDelete(offer)

delete job price offer

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ArrangedApiJobPriceOffersApi;


ArrangedApiJobPriceOffersApi apiInstance = new ArrangedApiJobPriceOffersApi();
String offer = "offer_example"; // String | 
try {
    apiInstance.apiJobPriceOfferDelete(offer);
} catch (ApiException e) {
    System.err.println("Exception when calling ArrangedApiJobPriceOffersApi#apiJobPriceOfferDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **offer** | **String**|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="apiJobPriceOfferGet"></a>
# **apiJobPriceOfferGet**
> apiJobPriceOfferGet(offer)

get job price offer

If you want to get a job price offer by ID Add offer&#x3D;offer_ID param.   Otherwise if you want to get a list of job price offers Add type&#x3D;all param and job&#x3D;job_ID param.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ArrangedApiJobPriceOffersApi;


ArrangedApiJobPriceOffersApi apiInstance = new ArrangedApiJobPriceOffersApi();
String offer = "offer_example"; // String | 
try {
    apiInstance.apiJobPriceOfferGet(offer);
} catch (ApiException e) {
    System.err.println("Exception when calling ArrangedApiJobPriceOffersApi#apiJobPriceOfferGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **offer** | **String**|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="apiJobPriceOfferPatch"></a>
# **apiJobPriceOfferPatch**
> apiJobPriceOfferPatch(body)

fatch job price offer

If you want to change the price add { \&quot;offer\&quot;: new_price } to body.  Otherwise the following code will be executed:  &#x60;await JobCrew.findByIdAndUpdate(req.body.jobCrew._id, { userRequestRemoval: true, });&#x60;

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ArrangedApiJobPriceOffersApi;


ArrangedApiJobPriceOffersApi apiInstance = new ArrangedApiJobPriceOffersApi();
Object body = null; // Object | 
try {
    apiInstance.apiJobPriceOfferPatch(body);
} catch (ApiException e) {
    System.err.println("Exception when calling ArrangedApiJobPriceOffersApi#apiJobPriceOfferPatch");
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

<a name="apiJobPriceOfferPost"></a>
# **apiJobPriceOfferPost**
> apiJobPriceOfferPost(body)

create job price offer

create job price offer in \&quot;jobpriceoffers\&quot; table

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ArrangedApiJobPriceOffersApi;


ArrangedApiJobPriceOffersApi apiInstance = new ArrangedApiJobPriceOffersApi();
Object body = null; // Object | 
try {
    apiInstance.apiJobPriceOfferPost(body);
} catch (ApiException e) {
    System.err.println("Exception when calling ArrangedApiJobPriceOffersApi#apiJobPriceOfferPost");
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

