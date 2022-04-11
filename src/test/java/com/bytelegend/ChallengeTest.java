package com.bytelegend;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ChallengeTest {
    @Test
    public void test() {
        software.amazon.awssdk.services.s3.model.PutObjectRequest request =
                Challenge.createPutObjectRequest(
                        "myBucket", "myKey", "iso-8859-1", "text/plain", 42L);
        Assertions.assertEquals("myBucket", request.bucket());
        Assertions.assertEquals("myKey", request.key());
        Assertions.assertEquals("iso-8859-1", request.contentEncoding());
        Assertions.assertEquals("text/plain", request.contentType());
        Assertions.assertEquals(42L, request.contentLength());
    }
}
