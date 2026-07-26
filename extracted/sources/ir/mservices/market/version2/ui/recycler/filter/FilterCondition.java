package ir.mservices.market.version2.ui.recycler.filter;

import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public abstract class FilterCondition implements Serializable {
    public final String a;

    public static final class IntCondition extends FilterCondition implements Serializable {
        public final Integer b;

        public IntCondition(String str, Integer num) {
            super(str);
            this.b = num;
        }
    }

    public static final class SimpleCondition extends FilterCondition implements Serializable {
    }

    public static final class StringCondition extends FilterCondition implements Serializable {
        public final String b;

        public StringCondition(String str) {
            super("onPikaAppFilter");
            this.b = str;
        }
    }

    public FilterCondition(String str) {
        this.a = str;
    }
}
