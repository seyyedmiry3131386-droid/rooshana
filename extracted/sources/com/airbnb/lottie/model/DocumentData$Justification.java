package com.airbnb.lottie.model;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class DocumentData$Justification {
    public static final DocumentData$Justification a;
    public static final /* synthetic */ DocumentData$Justification[] b;

    /* JADX INFO: Fake field, exist only in values array */
    DocumentData$Justification EF0;

    static {
        DocumentData$Justification documentData$Justification = new DocumentData$Justification("LEFT_ALIGN", 0);
        DocumentData$Justification documentData$Justification2 = new DocumentData$Justification("RIGHT_ALIGN", 1);
        DocumentData$Justification documentData$Justification3 = new DocumentData$Justification("CENTER", 2);
        a = documentData$Justification3;
        b = new DocumentData$Justification[]{documentData$Justification, documentData$Justification2, documentData$Justification3};
    }

    public static DocumentData$Justification valueOf(String str) {
        return (DocumentData$Justification) Enum.valueOf(DocumentData$Justification.class, str);
    }

    public static DocumentData$Justification[] values() {
        return (DocumentData$Justification[]) b.clone();
    }
}
