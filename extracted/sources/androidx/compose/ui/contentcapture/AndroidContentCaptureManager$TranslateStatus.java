package androidx.compose.ui.contentcapture;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
final class AndroidContentCaptureManager$TranslateStatus {
    public static final AndroidContentCaptureManager$TranslateStatus a;
    public static final AndroidContentCaptureManager$TranslateStatus b;
    public static final /* synthetic */ AndroidContentCaptureManager$TranslateStatus[] c;

    static {
        AndroidContentCaptureManager$TranslateStatus androidContentCaptureManager$TranslateStatus = new AndroidContentCaptureManager$TranslateStatus("SHOW_ORIGINAL", 0);
        a = androidContentCaptureManager$TranslateStatus;
        AndroidContentCaptureManager$TranslateStatus androidContentCaptureManager$TranslateStatus2 = new AndroidContentCaptureManager$TranslateStatus("SHOW_TRANSLATED", 1);
        b = androidContentCaptureManager$TranslateStatus2;
        AndroidContentCaptureManager$TranslateStatus[] androidContentCaptureManager$TranslateStatusArr = {androidContentCaptureManager$TranslateStatus, androidContentCaptureManager$TranslateStatus2};
        c = androidContentCaptureManager$TranslateStatusArr;
        kotlin.enums.a.a(androidContentCaptureManager$TranslateStatusArr);
    }

    public static AndroidContentCaptureManager$TranslateStatus valueOf(String str) {
        return (AndroidContentCaptureManager$TranslateStatus) Enum.valueOf(AndroidContentCaptureManager$TranslateStatus.class, str);
    }

    public static AndroidContentCaptureManager$TranslateStatus[] values() {
        return (AndroidContentCaptureManager$TranslateStatus[]) c.clone();
    }
}
