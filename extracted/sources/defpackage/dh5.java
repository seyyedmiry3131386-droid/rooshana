package defpackage;

import android.content.Context;
import ir.mservices.market.version2.webapi.responsedto.ErrorDTO;

/* JADX INFO: loaded from: classes3.dex */
public abstract class dh5 {
    public static Context a;

    static {
        eh5.a("NENE");
    }

    public static String a(int i) {
        if (i == 111) {
            return "WAITING";
        }
        if (i == 121) {
            return "PAUSED";
        }
        if (i == 141) {
            return "FINISHED";
        }
        if (i == 151) {
            return "CANCELED";
        }
        if (i == 191) {
            return "NOT_DEFINED";
        }
        if (i == 1311) {
            return "FAILED_NO_CATEGORY";
        }
        if (i == 1341) {
            return "FAILED_PREPROCESS_ERROR";
        }
        if (i == 1351) {
            return "FAILED_POSTPROCESS_ERROR";
        }
        switch (i) {
            case 101:
                return "DOWNLOADING_PREPROCESS";
            case 102:
                return "DOWNLOADING_CONNECT";
            case 103:
                return "DOWNLOADING_RECEIVE";
            case 104:
                return "DOWNLOADING_POSTPROCESS";
            default:
                switch (i) {
                    case 131:
                        return "FAILED_ERROR";
                    case 132:
                        return "FAILED_STORAGE";
                    case 133:
                        return "FAILED_NETWORK";
                    case 134:
                        return "FAILED_PREPROCESS_NO_CATEGORY";
                    case 135:
                        return "FAILED_POSTPROCESS_NO_CATEGORY";
                    case 136:
                        return "FAILED_INTEGRITY";
                    case 137:
                        return "FAILED_BAD_STATUS";
                    default:
                        switch (i) {
                            case 1331:
                                return "FAILED_NETWORK_NOT_CONNECTED";
                            case 1332:
                                return "FAILED_NETWORK_UNAUTHORIZED";
                            case 1333:
                                return "FAILED_NETWORK_BAD_RESPONSE";
                            case 1334:
                                return "FAILED_NETWORK_SERVER_4xx";
                            case 1335:
                                return "FAILED_NETWORK_SERVER_5xx";
                            default:
                                return bl4.q(i, " **ERROR detailed status = ", "**");
                        }
                }
        }
    }

    public static String b(int i) {
        switch (i) {
            case ErrorDTO.CODE_PACKAGE_NAME_NOT_IN_MYKET_ERROR /* 200 */:
                return "LAST_IN_QUEUE";
            case 201:
                return "NEXT_IN_QUEUE";
            case 202:
                return "FORCE_NOW";
            case 203:
                return "PAUSED";
            default:
                return bl4.q(i, " **ERROR priority = ", "**");
        }
    }

    public static String c(int i) {
        return i != 100 ? i != 110 ? i != 120 ? i != 130 ? i != 140 ? i != 150 ? i != 190 ? bl4.q(i, " **ERROR status = ", "**") : "NOT_DEFINED" : "CANCELED" : "FINISHED" : "FAILED" : "PAUSED" : "WAITING" : "DOWNLOADING";
    }
}
