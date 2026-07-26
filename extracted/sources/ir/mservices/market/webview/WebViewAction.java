package ir.mservices.market.webview;

import defpackage.js3;
import defpackage.o40;
import defpackage.r50;

/* JADX INFO: loaded from: classes3.dex */
public interface WebViewAction extends r50 {

    public static final class InitAction implements WebViewAction {
        private final String deviceType;

        public InitAction(String str) {
            js3.p(str, "deviceType");
            this.deviceType = str;
        }

        public static /* synthetic */ InitAction copy$default(InitAction initAction, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = initAction.deviceType;
            }
            return initAction.copy(str);
        }

        public final String component1() {
            return this.deviceType;
        }

        public final InitAction copy(String str) {
            js3.p(str, "deviceType");
            return new InitAction(str);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof InitAction) && js3.i(this.deviceType, ((InitAction) obj).deviceType);
        }

        public final String getDeviceType() {
            return this.deviceType;
        }

        public int hashCode() {
            return this.deviceType.hashCode();
        }

        public String toString() {
            return o40.y("InitAction(deviceType=", this.deviceType, ")");
        }
    }

    public static final class SetupHeaderAction implements WebViewAction {
        public static final SetupHeaderAction INSTANCE = new SetupHeaderAction();

        private SetupHeaderAction() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof SetupHeaderAction);
        }

        public int hashCode() {
            return 68282754;
        }

        public String toString() {
            return "SetupHeaderAction";
        }
    }
}
