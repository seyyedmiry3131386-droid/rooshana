package org.commonmark.internal;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
final class LinkReferenceDefinitionParser$State {
    public static final LinkReferenceDefinitionParser$State a;
    public static final LinkReferenceDefinitionParser$State b;
    public static final LinkReferenceDefinitionParser$State c;
    public static final LinkReferenceDefinitionParser$State d;
    public static final LinkReferenceDefinitionParser$State e;
    public static final LinkReferenceDefinitionParser$State f;
    public static final /* synthetic */ LinkReferenceDefinitionParser$State[] g;

    static {
        LinkReferenceDefinitionParser$State linkReferenceDefinitionParser$State = new LinkReferenceDefinitionParser$State("START_DEFINITION", 0);
        a = linkReferenceDefinitionParser$State;
        LinkReferenceDefinitionParser$State linkReferenceDefinitionParser$State2 = new LinkReferenceDefinitionParser$State("LABEL", 1);
        b = linkReferenceDefinitionParser$State2;
        LinkReferenceDefinitionParser$State linkReferenceDefinitionParser$State3 = new LinkReferenceDefinitionParser$State("DESTINATION", 2);
        c = linkReferenceDefinitionParser$State3;
        LinkReferenceDefinitionParser$State linkReferenceDefinitionParser$State4 = new LinkReferenceDefinitionParser$State("START_TITLE", 3);
        d = linkReferenceDefinitionParser$State4;
        LinkReferenceDefinitionParser$State linkReferenceDefinitionParser$State5 = new LinkReferenceDefinitionParser$State("TITLE", 4);
        e = linkReferenceDefinitionParser$State5;
        LinkReferenceDefinitionParser$State linkReferenceDefinitionParser$State6 = new LinkReferenceDefinitionParser$State("PARAGRAPH", 5);
        f = linkReferenceDefinitionParser$State6;
        g = new LinkReferenceDefinitionParser$State[]{linkReferenceDefinitionParser$State, linkReferenceDefinitionParser$State2, linkReferenceDefinitionParser$State3, linkReferenceDefinitionParser$State4, linkReferenceDefinitionParser$State5, linkReferenceDefinitionParser$State6};
    }

    public static LinkReferenceDefinitionParser$State valueOf(String str) {
        return (LinkReferenceDefinitionParser$State) Enum.valueOf(LinkReferenceDefinitionParser$State.class, str);
    }

    public static LinkReferenceDefinitionParser$State[] values() {
        return (LinkReferenceDefinitionParser$State[]) g.clone();
    }
}
