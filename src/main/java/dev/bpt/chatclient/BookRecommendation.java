package dev.bpt.chatclient;

public record BookRecommendation (
    String title,
    String author,
    int publicationYear,
    String whereToRead,
    String genre,
    int pageCount,
    String summary) {
}
