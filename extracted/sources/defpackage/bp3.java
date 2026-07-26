package defpackage;

import ir.mservices.market.version2.services.d;
import ir.mservices.market.version2.webapi.responsedto.ErrorDTO;

/* JADX INFO: loaded from: classes3.dex */
public final class bp3 {
    public final d a;
    public final dp3 b;
    public final c5 c;
    public final fw4 d;

    public bp3(d dVar, dp3 dp3Var, c5 c5Var, fw4 fw4Var) {
        js3.p(dVar, "generalService");
        js3.p(dp3Var, "installManager");
        js3.p(c5Var, "accountManager");
        js3.p(fw4Var, "miuiUtils");
        this.a = dVar;
        this.b = dp3Var;
        this.c = c5Var;
        this.d = fw4Var;
    }

    public static String a(int i) {
        switch (i) {
            case -110:
                return "INSTALL_FAILED_INTERNAL_ERROR: If the system failed to install the package because of system issues.";
            case -109:
                return "INSTALL_PARSE_FAILED_MANIFEST_EMPTY: If the parser did not find any actionable tags (instrumentation or application) in the manifest";
            case -108:
                return "INSTALL_PARSE_FAILED_MANIFEST_MALFORMED: If the parser encountered some structural problem in the manifest.";
            case -107:
                return "INSTALL_PARSE_FAILED_BAD_SHARED_USER_ID: If the parser encountered a bad shared user id name in the manifest.";
            case -106:
                return "INSTALL_PARSE_FAILED_BAD_PACKAGE_NAME: If the parser encountered a bad or missing package name in the manifest.";
            case -105:
                return "INSTALL_PARSE_FAILED_CERTIFICATE_ENCODING: If the parser encountered a CertificateEncodingException in one of the files in the .apk";
            case -104:
                return "INSTALL_PARSE_FAILED_INCONSISTENT_CERTIFICATES: If the parser found inconsistent certificates on the files in the .apk.";
            case -103:
                return "INSTALL_PARSE_FAILED_NO_CERTIFICATES: If the parser did not find any certificates in the .apk.";
            case -102:
                return "INSTALL_PARSE_FAILED_UNEXPECTED_EXCEPTION: If the parser encountered an unexpected exception.";
            case -101:
                return "INSTALL_PARSE_FAILED_BAD_MANIFEST: If the parser was unable to retrieve the AndroidManifest.xml file.";
            case -100:
                return "INSTALL_PARSE_FAILED_NOT_APK: If the parser was given a path that is not a file, or does not end with the expected '.apk' extension.";
            default:
                switch (i) {
                    case -24:
                        return "INSTALL_FAILED_UID_CHANGED: The new package is assigned a different UID than it previously held.";
                    case -23:
                        return "INSTALL_FAILED_PACKAGE_CHANGED: The package changed from what the calling program expected.";
                    case -22:
                        return "INSTALL_FAILED_VERIFICATION_FAILURE: The new package couldn't be installed because the verification did not succeed.";
                    case -21:
                        return "INSTALL_FAILED_VERIFICATION_TIMEOUT: The new package couldn't be installed because the verification timed out.";
                    case -20:
                        return "INSTALL_FAILED_MEDIA_UNAVAILABLE: The new package couldn't be installed in the specified install location because the media is not available.";
                    case -19:
                        return "INSTALL_FAILED_INVALID_INSTALL_LOCATION: The new package couldn't be installed in the specified install location";
                    case -18:
                        return "INSTALL_FAILED_CONTAINER_ERROR: A secure container mount point couldn't be accessed on external media.";
                    case -17:
                        return "INSTALL_FAILED_MISSING_FEATURE: The new package uses a feature that is not available.";
                    case -16:
                        return "INSTALL_FAILED_CPU_ABI_INCOMPATIBLE: The package being installed contains native code, but none that is compatible with the the device's CPU_ABI.";
                    case -15:
                        return "INSTALL_FAILED_TEST_ONLY: The new package failed because it has specified that it is a test-only package and the caller has not supplied the {@link #INSTALL_ALLOW_TEST} flag.";
                    case -14:
                        return "INSTALL_FAILED_NEWER_SDK: The new package failed because the current SDK version is newer than that required by the package.";
                    case -13:
                        return "INSTALL_FAILED_CONFLICTING_PROVIDER: The new package failed because it contains a content provider with the same authority as a provider already installed in the system.";
                    case -12:
                        return "INSTALL_FAILED_OLDER_SDK: The new package failed because the current SDK version is older than that required by the package.";
                    case -11:
                        return "INSTALL_FAILED_DEXOPT: The new package failed while optimizing and validating its dex files, either because there was not enough storage or the validation failed.";
                    case -10:
                        return "INSTALL_FAILED_REPLACE_COULDNT_DELETE: The new package uses a shared library that is not available.";
                    case -9:
                        return "INSTALL_FAILED_MISSING_SHARED_LIBRARY: The new package uses a shared library that is not available";
                    case -8:
                        return "INSTALL_FAILED_SHARED_USER_INCOMPATIBLE: The new package is requested a shared user which is already installed on the device and does not have matching signature.";
                    case -7:
                        return "INSTALL_FAILED_UPDATE_INCOMPATIBLE: A previously installed package of the same name has a different signature than the new package (and the old package's data was not removed).";
                    case -6:
                        return "INSTALL_FAILED_NO_SHARED_USER: The requested shared user does not exist.";
                    case -5:
                        return "INSTALL_FAILED_DUPLICATE_PACKAGE: A package is already installed with the same name";
                    case -4:
                        return "INSTALL_FAILED_INSUFFICIENT_STORAGE: The package manager service found that the device didn't have enough storage space to install the app.";
                    case ErrorDTO.CODE_REDIRECT_NOT_VALID_LOCATION_ERROR /* -3 */:
                        return "INSTALL_FAILED_INVALID_URI: The uri passed in is invalid";
                    case ErrorDTO.CODE_JSON_ERROR /* -2 */:
                        return "INSTALL_FAILED_INVALID_APK: The package archive file is invalid";
                    case -1:
                        return "INSTALL_FAILED_ALREADY_EXISTS: The package is already installed.";
                    default:
                        return bl4.q(i, "UNKNOWN_ERROR (", ")");
                }
        }
    }
}
