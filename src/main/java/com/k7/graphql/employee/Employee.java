package com.k7.graphql.employee;

import java.util.concurrent.atomic.AtomicInteger;

public record Employee(AtomicInteger id, String name, int age, String city) {
}
