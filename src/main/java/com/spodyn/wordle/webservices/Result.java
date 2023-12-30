package com.spodyn.wordle.webservices;

public record Result(CharacterResult[] results, String errorMessage) {
}
