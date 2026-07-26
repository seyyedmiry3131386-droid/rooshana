package ir.mservices.market.setting.fontStyle.ui;

import defpackage.js3;
import defpackage.r50;
import ir.mservices.market.core.Font$FontStyle;

/* JADX INFO: loaded from: classes3.dex */
public interface FontAction extends r50 {

    public static final class SelectFont implements FontAction {
        private final Font$FontStyle selectedFont;

        public SelectFont(Font$FontStyle font$FontStyle) {
            js3.p(font$FontStyle, "selectedFont");
            this.selectedFont = font$FontStyle;
        }

        public final Font$FontStyle getSelectedFont() {
            return this.selectedFont;
        }
    }
}
