/*
Copyright 2024 The Kubernetes Authors.
Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at
http://www.apache.org/licenses/LICENSE-2.0
Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
*/
package io.kubernetes.client.openapi.models;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.kubernetes.client.openapi.models.V1alpha2NamedResourcesFilter;
import java.io.IOException;
import java.util.Arrays;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import io.kubernetes.client.openapi.JSON;

/**
 * ResourceFilter is a filter for resources from one particular driver.
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-09-09T20:15:56.920539Z[Etc/UTC]", comments = "Generator version: 7.6.0")
public class V1alpha2ResourceFilter {
  public static final String SERIALIZED_NAME_DRIVER_NAME = "driverName";
  @SerializedName(SERIALIZED_NAME_DRIVER_NAME)
  private String driverName;

  public static final String SERIALIZED_NAME_NAMED_RESOURCES = "namedResources";
  @SerializedName(SERIALIZED_NAME_NAMED_RESOURCES)
  private V1alpha2NamedResourcesFilter namedResources;

  public V1alpha2ResourceFilter() {
  }

  public V1alpha2ResourceFilter driverName(String driverName) {
    this.driverName = driverName;
    return this;
  }

   /**
   * DriverName is the name used by the DRA driver kubelet plugin.
   * @return driverName
  **/
  @jakarta.annotation.Nullable
  public String getDriverName() {
    return driverName;
  }

  public void setDriverName(String driverName) {
    this.driverName = driverName;
  }


  public V1alpha2ResourceFilter namedResources(V1alpha2NamedResourcesFilter namedResources) {
    this.namedResources = namedResources;
    return this;
  }

   /**
   * Get namedResources
   * @return namedResources
  **/
  @jakarta.annotation.Nullable
  public V1alpha2NamedResourcesFilter getNamedResources() {
    return namedResources;
  }

  public void setNamedResources(V1alpha2NamedResourcesFilter namedResources) {
    this.namedResources = namedResources;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1alpha2ResourceFilter v1alpha2ResourceFilter = (V1alpha2ResourceFilter) o;
    return Objects.equals(this.driverName, v1alpha2ResourceFilter.driverName) &&
        Objects.equals(this.namedResources, v1alpha2ResourceFilter.namedResources);
  }

  @Override
  public int hashCode() {
    return Objects.hash(driverName, namedResources);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha2ResourceFilter {\n");
    sb.append("    driverName: ").append(toIndentedString(driverName)).append("\n");
    sb.append("    namedResources: ").append(toIndentedString(namedResources)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("driverName");
    openapiFields.add("namedResources");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to V1alpha2ResourceFilter
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!V1alpha2ResourceFilter.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1alpha2ResourceFilter is not found in the empty JSON string", V1alpha2ResourceFilter.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!V1alpha2ResourceFilter.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1alpha2ResourceFilter` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("driverName") != null && !jsonObj.get("driverName").isJsonNull()) && !jsonObj.get("driverName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `driverName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("driverName").toString()));
      }
      // validate the optional field `namedResources`
      if (jsonObj.get("namedResources") != null && !jsonObj.get("namedResources").isJsonNull()) {
        V1alpha2NamedResourcesFilter.validateJsonElement(jsonObj.get("namedResources"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1alpha2ResourceFilter.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1alpha2ResourceFilter' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1alpha2ResourceFilter> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1alpha2ResourceFilter.class));

       return (TypeAdapter<T>) new TypeAdapter<V1alpha2ResourceFilter>() {
           @Override
           public void write(JsonWriter out, V1alpha2ResourceFilter value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1alpha2ResourceFilter read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of V1alpha2ResourceFilter given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of V1alpha2ResourceFilter
  * @throws IOException if the JSON string is invalid with respect to V1alpha2ResourceFilter
  */
  public static V1alpha2ResourceFilter fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, V1alpha2ResourceFilter.class);
  }

 /**
  * Convert an instance of V1alpha2ResourceFilter to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
