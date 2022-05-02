package com.example.pattern.client;

import com.example.pattern.adapter.TranslatorAdapter;
import com.example.pattern.model.JapaneseAdaptee;
import com.example.pattern.target.VietnameseTarget;

public class VietnameseClient {
    public static void main(String[] args) {
        VietnameseTarget client = new TranslatorAdapter(new JapaneseAdaptee());
        client.send("Xin chào");
    }
}
