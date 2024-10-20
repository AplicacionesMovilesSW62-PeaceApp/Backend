package com.upc.pre.peaceapp.schemas;

public record AlertSchema(String location, String type, String description, int user_id, String image_url) { // Added image_url
}
