package ru.job4j.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.*;

public class SearchAtt {


    public static List<Attachment> filterSize(List<Attachment> list, String info) {
        BiFunction<List<Attachment>, Attachment, List<Attachment>> function = new BiFunction<List<Attachment>, Attachment, List<Attachment>>() {
            @Override
            public List<Attachment> apply(List<Attachment> attachments, Attachment attachment) {
                if (attachment.getSize() > Integer.valueOf(info)) {
                    attachments.add(attachment);
                }
                return attachments;
            }
        };
        Supplier<String> initValue = new Supplier<String>() {
            @Override
            public String get() {
                return "100";
            }
        };
        return filter(function, initValue, list);
    }

            public static List<Attachment> filterName(List<Attachment> list, String info) {
                BiFunction<List<Attachment>, Attachment, List<Attachment>> function = new BiFunction<List<Attachment>, Attachment, List<Attachment>>() {
                    @Override
                    public List<Attachment> apply(List<Attachment> attachments, Attachment attachment) {
                        if (attachment.getName().contains(info)) {
                            attachments.add(attachment);
                        }
                        return attachments;
                    }
                };
                Supplier<String> initValue = new Supplier<String>() {
                    @Override
                    public String get() {
                        return "bug";
                    }
                };
                return filter(function, initValue, list);
            }

            public static List<Attachment> filter(BiFunction<List<Attachment>, Attachment, List<Attachment>> function, Supplier<String> initValue, List<Attachment> list) {
                List<Attachment> listRsl = new ArrayList<>();
                String info = initValue.get();
                for (Attachment att : list) {
                    listRsl = function.apply(listRsl, att);
                }
                return listRsl;
            }
        }