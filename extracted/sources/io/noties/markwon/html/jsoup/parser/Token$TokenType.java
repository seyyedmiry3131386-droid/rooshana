package io.noties.markwon.html.jsoup.parser;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class Token$TokenType {
    public static final Token$TokenType a;
    public static final Token$TokenType b;
    public static final Token$TokenType c;
    public static final Token$TokenType d;
    public static final Token$TokenType e;
    public static final Token$TokenType f;
    public static final /* synthetic */ Token$TokenType[] g;

    static {
        Token$TokenType token$TokenType = new Token$TokenType("Doctype", 0);
        a = token$TokenType;
        Token$TokenType token$TokenType2 = new Token$TokenType("StartTag", 1);
        b = token$TokenType2;
        Token$TokenType token$TokenType3 = new Token$TokenType("EndTag", 2);
        c = token$TokenType3;
        Token$TokenType token$TokenType4 = new Token$TokenType("Comment", 3);
        d = token$TokenType4;
        Token$TokenType token$TokenType5 = new Token$TokenType("Character", 4);
        e = token$TokenType5;
        Token$TokenType token$TokenType6 = new Token$TokenType("EOF", 5);
        f = token$TokenType6;
        g = new Token$TokenType[]{token$TokenType, token$TokenType2, token$TokenType3, token$TokenType4, token$TokenType5, token$TokenType6};
    }

    public static Token$TokenType valueOf(String str) {
        return (Token$TokenType) Enum.valueOf(Token$TokenType.class, str);
    }

    public static Token$TokenType[] values() {
        return (Token$TokenType[]) g.clone();
    }
}
