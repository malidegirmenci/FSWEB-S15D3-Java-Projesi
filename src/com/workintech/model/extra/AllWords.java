package com.workintech.model.extra;

public class AllWords {
    private String paragraph;

    public AllWords(String paragraph) {
        this.paragraph = paragraph;
    }

    public void setParagraph(String paragraph) {
        this.paragraph = paragraph;
    }

    public String getParagraph() {
        return paragraph;
    }
    public void clearNonWords(){
        this.paragraph = this.paragraph.replaceAll("[.,?!+]","");
        this.paragraph = this.paragraph.replace("\n","");
        this.paragraph = this.paragraph.replace("  ","");
    }
    public String[] convertToArr(){
        return this.paragraph.split(" ");
    }
    @Override
    public String toString() {
        return "AllWords{" +
                "Paragraph='" + paragraph + '\'' +
                '}';
    }
}
