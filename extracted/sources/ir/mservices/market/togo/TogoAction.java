package ir.mservices.market.togo;

import defpackage.bl4;
import defpackage.js3;
import defpackage.o40;
import defpackage.r50;
import defpackage.rh5;
import defpackage.rm7;
import defpackage.yd1;
import ir.mservices.market.togo.data.AttachImageCallbackData;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public interface TogoAction extends r50 {

    public static final class AttachImageAction implements TogoAction {
        private final AttachImageCallbackData attachImageCallbackData;

        /* JADX WARN: Multi-variable type inference failed */
        public AttachImageAction() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public static /* synthetic */ AttachImageAction copy$default(AttachImageAction attachImageAction, AttachImageCallbackData attachImageCallbackData, int i, Object obj) {
            if ((i & 1) != 0) {
                attachImageCallbackData = attachImageAction.attachImageCallbackData;
            }
            return attachImageAction.copy(attachImageCallbackData);
        }

        public final AttachImageCallbackData component1() {
            return this.attachImageCallbackData;
        }

        public final AttachImageAction copy(AttachImageCallbackData attachImageCallbackData) {
            return new AttachImageAction(attachImageCallbackData);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof AttachImageAction) && js3.i(this.attachImageCallbackData, ((AttachImageAction) obj).attachImageCallbackData);
        }

        public final AttachImageCallbackData getAttachImageCallbackData() {
            return this.attachImageCallbackData;
        }

        public int hashCode() {
            AttachImageCallbackData attachImageCallbackData = this.attachImageCallbackData;
            if (attachImageCallbackData == null) {
                return 0;
            }
            return attachImageCallbackData.hashCode();
        }

        public String toString() {
            return "AttachImageAction(attachImageCallbackData=" + this.attachImageCallbackData + ")";
        }

        public AttachImageAction(AttachImageCallbackData attachImageCallbackData) {
            this.attachImageCallbackData = attachImageCallbackData;
        }

        public /* synthetic */ AttachImageAction(AttachImageCallbackData attachImageCallbackData, int i, yd1 yd1Var) {
            this((i & 1) != 0 ? null : attachImageCallbackData);
        }
    }

    public static final class ButtonTypeAction implements TogoAction {
        private final String buttonType;

        public ButtonTypeAction(String str) {
            js3.p(str, "buttonType");
            this.buttonType = str;
        }

        public static /* synthetic */ ButtonTypeAction copy$default(ButtonTypeAction buttonTypeAction, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = buttonTypeAction.buttonType;
            }
            return buttonTypeAction.copy(str);
        }

        public final String component1() {
            return this.buttonType;
        }

        public final ButtonTypeAction copy(String str) {
            js3.p(str, "buttonType");
            return new ButtonTypeAction(str);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ButtonTypeAction) && js3.i(this.buttonType, ((ButtonTypeAction) obj).buttonType);
        }

        public final String getButtonType() {
            return this.buttonType;
        }

        public int hashCode() {
            return this.buttonType.hashCode();
        }

        public String toString() {
            return o40.y("ButtonTypeAction(buttonType=", this.buttonType, ")");
        }
    }

    public static final class CacheControlAction implements TogoAction {
        private final boolean enable;

        public CacheControlAction(boolean z) {
            this.enable = z;
        }

        public static /* synthetic */ CacheControlAction copy$default(CacheControlAction cacheControlAction, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                z = cacheControlAction.enable;
            }
            return cacheControlAction.copy(z);
        }

        public final boolean component1() {
            return this.enable;
        }

        public final CacheControlAction copy(boolean z) {
            return new CacheControlAction(z);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof CacheControlAction) && this.enable == ((CacheControlAction) obj).enable;
        }

        public final boolean getEnable() {
            return this.enable;
        }

        public int hashCode() {
            return this.enable ? 1231 : 1237;
        }

        public String toString() {
            return bl4.x("CacheControlAction(enable=", ")", this.enable);
        }
    }

    public static final class CheckUrlSafeForJsAction implements TogoAction {
        private final String url;

        public CheckUrlSafeForJsAction(String str) {
            js3.p(str, "url");
            this.url = str;
        }

        public static /* synthetic */ CheckUrlSafeForJsAction copy$default(CheckUrlSafeForJsAction checkUrlSafeForJsAction, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = checkUrlSafeForJsAction.url;
            }
            return checkUrlSafeForJsAction.copy(str);
        }

        public final String component1() {
            return this.url;
        }

        public final CheckUrlSafeForJsAction copy(String str) {
            js3.p(str, "url");
            return new CheckUrlSafeForJsAction(str);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof CheckUrlSafeForJsAction) && js3.i(this.url, ((CheckUrlSafeForJsAction) obj).url);
        }

        public final String getUrl() {
            return this.url;
        }

        public int hashCode() {
            return this.url.hashCode();
        }

        public String toString() {
            return o40.y("CheckUrlSafeForJsAction(url=", this.url, ")");
        }
    }

    public static final class CookieCallbackAction implements TogoAction {
        public static final CookieCallbackAction INSTANCE = new CookieCallbackAction();

        private CookieCallbackAction() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof CookieCallbackAction);
        }

        public int hashCode() {
            return 408379635;
        }

        public String toString() {
            return "CookieCallbackAction";
        }
    }

    public static final class CreateCookieAction implements TogoAction {
        public static final CreateCookieAction INSTANCE = new CreateCookieAction();

        private CreateCookieAction() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof CreateCookieAction);
        }

        public int hashCode() {
            return 70652010;
        }

        public String toString() {
            return "CreateCookieAction";
        }
    }

    public static final class GetAccountIdAction implements TogoAction {
        public static final GetAccountIdAction INSTANCE = new GetAccountIdAction();

        private GetAccountIdAction() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof GetAccountIdAction);
        }

        public int hashCode() {
            return -30222884;
        }

        public String toString() {
            return "GetAccountIdAction";
        }
    }

    public static final class GetAccountInfoAction implements TogoAction {
        private final String errorCallback;
        private final String successCallback;

        public GetAccountInfoAction(String str, String str2) {
            this.successCallback = str;
            this.errorCallback = str2;
        }

        public static /* synthetic */ GetAccountInfoAction copy$default(GetAccountInfoAction getAccountInfoAction, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = getAccountInfoAction.successCallback;
            }
            if ((i & 2) != 0) {
                str2 = getAccountInfoAction.errorCallback;
            }
            return getAccountInfoAction.copy(str, str2);
        }

        public final String component1() {
            return this.successCallback;
        }

        public final String component2() {
            return this.errorCallback;
        }

        public final GetAccountInfoAction copy(String str, String str2) {
            return new GetAccountInfoAction(str, str2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof GetAccountInfoAction)) {
                return false;
            }
            GetAccountInfoAction getAccountInfoAction = (GetAccountInfoAction) obj;
            return js3.i(this.successCallback, getAccountInfoAction.successCallback) && js3.i(this.errorCallback, getAccountInfoAction.errorCallback);
        }

        public final String getErrorCallback() {
            return this.errorCallback;
        }

        public final String getSuccessCallback() {
            return this.successCallback;
        }

        public int hashCode() {
            String str = this.successCallback;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.errorCallback;
            return iHashCode + (str2 != null ? str2.hashCode() : 0);
        }

        public String toString() {
            return bl4.w("GetAccountInfoAction(successCallback=", this.successCallback, ", errorCallback=", this.errorCallback, ")");
        }
    }

    public static final class GetAccountKeyAction implements TogoAction {
        public static final GetAccountKeyAction INSTANCE = new GetAccountKeyAction();

        private GetAccountKeyAction() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof GetAccountKeyAction);
        }

        public int hashCode() {
            return -1342211030;
        }

        public String toString() {
            return "GetAccountKeyAction";
        }
    }

    public static final class GetAppDetailAction implements TogoAction {
        private final String dataExpansion;
        private final int minHeightWidth;
        private final String packageName;
        private final String refId;

        public GetAppDetailAction(String str, String str2, String str3, int i) {
            js3.p(str, "packageName");
            js3.p(str2, "refId");
            this.packageName = str;
            this.refId = str2;
            this.dataExpansion = str3;
            this.minHeightWidth = i;
        }

        public static /* synthetic */ GetAppDetailAction copy$default(GetAppDetailAction getAppDetailAction, String str, String str2, String str3, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                str = getAppDetailAction.packageName;
            }
            if ((i2 & 2) != 0) {
                str2 = getAppDetailAction.refId;
            }
            if ((i2 & 4) != 0) {
                str3 = getAppDetailAction.dataExpansion;
            }
            if ((i2 & 8) != 0) {
                i = getAppDetailAction.minHeightWidth;
            }
            return getAppDetailAction.copy(str, str2, str3, i);
        }

        public final String component1() {
            return this.packageName;
        }

        public final String component2() {
            return this.refId;
        }

        public final String component3() {
            return this.dataExpansion;
        }

        public final int component4() {
            return this.minHeightWidth;
        }

        public final GetAppDetailAction copy(String str, String str2, String str3, int i) {
            js3.p(str, "packageName");
            js3.p(str2, "refId");
            return new GetAppDetailAction(str, str2, str3, i);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof GetAppDetailAction)) {
                return false;
            }
            GetAppDetailAction getAppDetailAction = (GetAppDetailAction) obj;
            return js3.i(this.packageName, getAppDetailAction.packageName) && js3.i(this.refId, getAppDetailAction.refId) && js3.i(this.dataExpansion, getAppDetailAction.dataExpansion) && this.minHeightWidth == getAppDetailAction.minHeightWidth;
        }

        public final String getDataExpansion() {
            return this.dataExpansion;
        }

        public final int getMinHeightWidth() {
            return this.minHeightWidth;
        }

        public final String getPackageName() {
            return this.packageName;
        }

        public final String getRefId() {
            return this.refId;
        }

        public int hashCode() {
            int iK = rm7.k(this.refId, this.packageName.hashCode() * 31, 31);
            String str = this.dataExpansion;
            return ((iK + (str == null ? 0 : str.hashCode())) * 31) + this.minHeightWidth;
        }

        public String toString() {
            String str = this.packageName;
            String str2 = this.refId;
            String str3 = this.dataExpansion;
            int i = this.minHeightWidth;
            StringBuilder sbT = rm7.t("GetAppDetailAction(packageName=", str, ", refId=", str2, ", dataExpansion=");
            sbT.append(str3);
            sbT.append(", minHeightWidth=");
            sbT.append(i);
            sbT.append(")");
            return sbT.toString();
        }
    }

    public static final class GetBindsAction implements TogoAction {
        public static final GetBindsAction INSTANCE = new GetBindsAction();

        private GetBindsAction() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof GetBindsAction);
        }

        public int hashCode() {
            return -1586765302;
        }

        public String toString() {
            return "GetBindsAction";
        }
    }

    public static final class GetGoogleAdId implements TogoAction {
        private final String errorCallback;
        private final String successCallback;
        private final long timeout;

        public GetGoogleAdId(long j, String str, String str2) {
            this.timeout = j;
            this.successCallback = str;
            this.errorCallback = str2;
        }

        public static /* synthetic */ GetGoogleAdId copy$default(GetGoogleAdId getGoogleAdId, long j, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                j = getGoogleAdId.timeout;
            }
            if ((i & 2) != 0) {
                str = getGoogleAdId.successCallback;
            }
            if ((i & 4) != 0) {
                str2 = getGoogleAdId.errorCallback;
            }
            return getGoogleAdId.copy(j, str, str2);
        }

        public final long component1() {
            return this.timeout;
        }

        public final String component2() {
            return this.successCallback;
        }

        public final String component3() {
            return this.errorCallback;
        }

        public final GetGoogleAdId copy(long j, String str, String str2) {
            return new GetGoogleAdId(j, str, str2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof GetGoogleAdId)) {
                return false;
            }
            GetGoogleAdId getGoogleAdId = (GetGoogleAdId) obj;
            return this.timeout == getGoogleAdId.timeout && js3.i(this.successCallback, getGoogleAdId.successCallback) && js3.i(this.errorCallback, getGoogleAdId.errorCallback);
        }

        public final String getErrorCallback() {
            return this.errorCallback;
        }

        public final String getSuccessCallback() {
            return this.successCallback;
        }

        public final long getTimeout() {
            return this.timeout;
        }

        public int hashCode() {
            long j = this.timeout;
            int i = ((int) (j ^ (j >>> 32))) * 31;
            String str = this.successCallback;
            int iHashCode = (i + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.errorCallback;
            return iHashCode + (str2 != null ? str2.hashCode() : 0);
        }

        public String toString() {
            long j = this.timeout;
            String str = this.successCallback;
            String str2 = this.errorCallback;
            StringBuilder sb = new StringBuilder("GetGoogleAdId(timeout=");
            sb.append(j);
            sb.append(", successCallback=");
            sb.append(str);
            return bl4.z(sb, ", errorCallback=", str2, ")");
        }
    }

    public static final class GetInstalledAppsAction implements TogoAction {
        public static final GetInstalledAppsAction INSTANCE = new GetInstalledAppsAction();

        private GetInstalledAppsAction() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof GetInstalledAppsAction);
        }

        public int hashCode() {
            return -244242240;
        }

        public String toString() {
            return "GetInstalledAppsAction";
        }
    }

    public static final class GetMetadataAction implements TogoAction {
        private final String successCallback;

        public GetMetadataAction(String str) {
            this.successCallback = str;
        }

        public static /* synthetic */ GetMetadataAction copy$default(GetMetadataAction getMetadataAction, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = getMetadataAction.successCallback;
            }
            return getMetadataAction.copy(str);
        }

        public final String component1() {
            return this.successCallback;
        }

        public final GetMetadataAction copy(String str) {
            return new GetMetadataAction(str);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof GetMetadataAction) && js3.i(this.successCallback, ((GetMetadataAction) obj).successCallback);
        }

        public final String getSuccessCallback() {
            return this.successCallback;
        }

        public int hashCode() {
            String str = this.successCallback;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public String toString() {
            return o40.y("GetMetadataAction(successCallback=", this.successCallback, ")");
        }
    }

    public static final class GetProfileInfoAction implements TogoAction {
        public static final GetProfileInfoAction INSTANCE = new GetProfileInfoAction();

        private GetProfileInfoAction() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof GetProfileInfoAction);
        }

        public int hashCode() {
            return 1854720235;
        }

        public String toString() {
            return "GetProfileInfoAction";
        }
    }

    public static final class GetTokenAction implements TogoAction {
        public static final GetTokenAction INSTANCE = new GetTokenAction();

        private GetTokenAction() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof GetTokenAction);
        }

        public int hashCode() {
            return 1976422893;
        }

        public String toString() {
            return "GetTokenAction";
        }
    }

    public static final class InitAction implements TogoAction {
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

    public static final class IsAppInstalledAction implements TogoAction {
        private final String packageName;

        public IsAppInstalledAction(String str) {
            this.packageName = str;
        }

        public static /* synthetic */ IsAppInstalledAction copy$default(IsAppInstalledAction isAppInstalledAction, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = isAppInstalledAction.packageName;
            }
            return isAppInstalledAction.copy(str);
        }

        public final String component1() {
            return this.packageName;
        }

        public final IsAppInstalledAction copy(String str) {
            return new IsAppInstalledAction(str);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof IsAppInstalledAction) && js3.i(this.packageName, ((IsAppInstalledAction) obj).packageName);
        }

        public final String getPackageName() {
            return this.packageName;
        }

        public int hashCode() {
            String str = this.packageName;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public String toString() {
            return o40.y("IsAppInstalledAction(packageName=", this.packageName, ")");
        }
    }

    public static final class IsLoginAction implements TogoAction {
        public static final IsLoginAction INSTANCE = new IsLoginAction();

        private IsLoginAction() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof IsLoginAction);
        }

        public int hashCode() {
            return -1030653087;
        }

        public String toString() {
            return "IsLoginAction";
        }
    }

    public static final class LoadPageAction implements TogoAction {
        private final String url;

        public LoadPageAction(String str) {
            js3.p(str, "url");
            this.url = str;
        }

        public static /* synthetic */ LoadPageAction copy$default(LoadPageAction loadPageAction, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = loadPageAction.url;
            }
            return loadPageAction.copy(str);
        }

        public final String component1() {
            return this.url;
        }

        public final LoadPageAction copy(String str) {
            js3.p(str, "url");
            return new LoadPageAction(str);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof LoadPageAction) && js3.i(this.url, ((LoadPageAction) obj).url);
        }

        public final String getUrl() {
            return this.url;
        }

        public int hashCode() {
            return this.url.hashCode();
        }

        public String toString() {
            return o40.y("LoadPageAction(url=", this.url, ")");
        }
    }

    public static final class NativeBackEnableAction implements TogoAction {
        private final rh5 nativeBackData;

        public NativeBackEnableAction(rh5 rh5Var) {
            js3.p(rh5Var, "nativeBackData");
            this.nativeBackData = rh5Var;
        }

        public static /* synthetic */ NativeBackEnableAction copy$default(NativeBackEnableAction nativeBackEnableAction, rh5 rh5Var, int i, Object obj) {
            if ((i & 1) != 0) {
                rh5Var = nativeBackEnableAction.nativeBackData;
            }
            return nativeBackEnableAction.copy(rh5Var);
        }

        public final rh5 component1() {
            return this.nativeBackData;
        }

        public final NativeBackEnableAction copy(rh5 rh5Var) {
            js3.p(rh5Var, "nativeBackData");
            return new NativeBackEnableAction(rh5Var);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof NativeBackEnableAction) && js3.i(this.nativeBackData, ((NativeBackEnableAction) obj).nativeBackData);
        }

        public final rh5 getNativeBackData() {
            return this.nativeBackData;
        }

        public int hashCode() {
            return this.nativeBackData.hashCode();
        }

        public String toString() {
            return "NativeBackEnableAction(nativeBackData=" + this.nativeBackData + ")";
        }
    }

    public static final class SafeDomainAction implements TogoAction {
        private final List<String> safeDomains;

        public SafeDomainAction(List<String> list) {
            js3.p(list, "safeDomains");
            this.safeDomains = list;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ SafeDomainAction copy$default(SafeDomainAction safeDomainAction, List list, int i, Object obj) {
            if ((i & 1) != 0) {
                list = safeDomainAction.safeDomains;
            }
            return safeDomainAction.copy(list);
        }

        public final List<String> component1() {
            return this.safeDomains;
        }

        public final SafeDomainAction copy(List<String> list) {
            js3.p(list, "safeDomains");
            return new SafeDomainAction(list);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SafeDomainAction) && js3.i(this.safeDomains, ((SafeDomainAction) obj).safeDomains);
        }

        public final List<String> getSafeDomains() {
            return this.safeDomains;
        }

        public int hashCode() {
            return this.safeDomains.hashCode();
        }

        public String toString() {
            return "SafeDomainAction(safeDomains=" + this.safeDomains + ")";
        }
    }

    public static final class SetupHeaderAction implements TogoAction {
        public static final SetupHeaderAction INSTANCE = new SetupHeaderAction();

        private SetupHeaderAction() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof SetupHeaderAction);
        }

        public int hashCode() {
            return -1074344916;
        }

        public String toString() {
            return "SetupHeaderAction";
        }
    }
}
