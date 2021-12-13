package com.company.task2;

import java.util.List;

public class BoardGame {
    private String name;
    private List<GameDetails> details;
    private List<Author> authors;

    public double definePrice(){
        double priceOfDetails = details.stream()
                .mapToDouble(GameDetails::getPricePerEach)
                .sum();

        double authorPart = authors.size() > 10? (priceOfDetails / 100) * 10: (priceOfDetails / 100) * authors.size();
        double taxPart = (priceOfDetails + authorPart * 20) / 100;
        double total = priceOfDetails +  authorPart + taxPart;
        return total;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<GameDetails> getDetails() {
        return details;
    }

    public void setDetails(List<GameDetails> details) {
        this.details = details;
    }

    public List<Author> getAuthors() {
        return authors;
    }

    public void setAuthors(List<Author> authors) {
        this.authors = authors;
    }
}
