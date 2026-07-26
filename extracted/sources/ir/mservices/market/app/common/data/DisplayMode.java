package ir.mservices.market.app.common.data;

import defpackage.wp1;

/* JADX INFO: loaded from: classes3.dex */
public interface DisplayMode {
    public static final Companion Companion = Companion.$$INSTANCE;
    public static final String DIGESTED_HORIZONTAL_1 = "DigestedHorizontal1";
    public static final String DIGESTED_HORIZONTAL_2 = "DigestedHorizontal2";
    public static final String DIGESTED_HORIZONTAL_3 = "DigestedHorizontal3";
    public static final String DIGESTED_VERTICAL = "DigestedVertical";
    public static final String HORIZONTAL_1 = "Horizontal1";
    public static final String HORIZONTAL_2 = "Horizontal2";
    public static final String HORIZONTAL_3 = "Horizontal3";
    public static final String VERTICAL = "Vertical";

    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        public static final String DIGESTED_HORIZONTAL_1 = "DigestedHorizontal1";
        public static final String DIGESTED_HORIZONTAL_2 = "DigestedHorizontal2";
        public static final String DIGESTED_HORIZONTAL_3 = "DigestedHorizontal3";
        public static final String DIGESTED_VERTICAL = "DigestedVertical";
        public static final String HORIZONTAL_1 = "Horizontal1";
        public static final String HORIZONTAL_2 = "Horizontal2";
        public static final String HORIZONTAL_3 = "Horizontal3";
        public static final String VERTICAL = "Vertical";

        private Companion() {
        }
    }

    public static final class DefaultImpls {
        @Deprecated
        public static int getHorizontalType(DisplayMode displayMode) {
            return wp1.a(displayMode);
        }

        @Deprecated
        public static boolean isDigested(DisplayMode displayMode) {
            return wp1.b(displayMode);
        }

        @Deprecated
        public static boolean isMulti(DisplayMode displayMode) {
            return wp1.c(displayMode);
        }
    }

    int getHorizontalType();

    String getMode();

    boolean isDigested();

    boolean isMulti();
}
