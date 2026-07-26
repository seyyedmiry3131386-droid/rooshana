package ir.mservices.market.setting.themeStyle;

import defpackage.js3;
import defpackage.r50;
import ir.mservices.market.theme.ThemeStyle;

/* JADX INFO: loaded from: classes3.dex */
public interface ThemeStyleAction extends r50 {

    public static final class SelectThemeAction implements ThemeStyleAction {
        private final ThemeStyle selectedTheme;

        public SelectThemeAction(ThemeStyle themeStyle) {
            js3.p(themeStyle, "selectedTheme");
            this.selectedTheme = themeStyle;
        }

        public static /* synthetic */ SelectThemeAction copy$default(SelectThemeAction selectThemeAction, ThemeStyle themeStyle, int i, Object obj) {
            if ((i & 1) != 0) {
                themeStyle = selectThemeAction.selectedTheme;
            }
            return selectThemeAction.copy(themeStyle);
        }

        public final ThemeStyle component1() {
            return this.selectedTheme;
        }

        public final SelectThemeAction copy(ThemeStyle themeStyle) {
            js3.p(themeStyle, "selectedTheme");
            return new SelectThemeAction(themeStyle);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SelectThemeAction) && this.selectedTheme == ((SelectThemeAction) obj).selectedTheme;
        }

        public final ThemeStyle getSelectedTheme() {
            return this.selectedTheme;
        }

        public int hashCode() {
            return this.selectedTheme.hashCode();
        }

        public String toString() {
            return "SelectThemeAction(selectedTheme=" + this.selectedTheme + ")";
        }
    }

    public static final class SetThemeAction implements ThemeStyleAction {
        public static final SetThemeAction INSTANCE = new SetThemeAction();

        private SetThemeAction() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof SetThemeAction);
        }

        public int hashCode() {
            return 1710249967;
        }

        public String toString() {
            return "SetThemeAction";
        }
    }
}
