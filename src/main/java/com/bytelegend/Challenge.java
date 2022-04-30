package com.bytelegend;

public class Challenge {
    public static void main() {
        System.out.println(createPutObjectRequest("bucket", "key", "utf-8", "plain/text", 1234L));
    }

    public static software.amazon.awssdk.services.s3.model.PutObjectRequest createPutObjectRequest(String bucket, String key, String contentEncoding, String contentType, Long contentLength) {
        return software.amazon.awssdk.services.s3.model.PutObjectRequest.builder()
                                                                        .bucket(bucket)
                                                                        .key(key)
                                                                        .contentEncoding(contentEncoding)
                                                                        .contentType(contentType)
                                                                        .contentLength(contentLength)
                                                                        .build();
    }
}
