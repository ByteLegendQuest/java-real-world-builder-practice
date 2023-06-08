package com.bytelegend;

import software.amazon.awssdk.services.s3.model.PutObjectRequest;

public class Challenge {
    public static void main(String[] args) {
        System.out.println(createPutObjectRequest("bucket", "key", "utf-8", "plain/text", 1234L));
    }

    public static PutObjectRequest createPutObjectRequest(
            String bucket,
            String key,
            String contentEncoding,
            String contentType,
            Long contentLength) {

        return PutObjectRequest.builder().bucket(bucket).key(key).contentEncoding(contentEncoding).contentType(contentType).contentLength(contentLength).build();
    }
}
