package defpackage;

import android.content.ClipData;
import android.net.Uri;
import android.os.Bundle;
import android.view.ContentInfo;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class d41 implements c41, e41 {
    public final /* synthetic */ int a = 0;
    public ClipData b;
    public int c;
    public int d;
    public Uri e;
    public Bundle f;

    public /* synthetic */ d41() {
    }

    @Override // defpackage.c41
    public void a(Uri uri) {
        this.e = uri;
    }

    @Override // defpackage.c41
    public void b(int i) {
        this.d = i;
    }

    @Override // defpackage.c41
    public f41 build() {
        return new f41(new d41(this));
    }

    @Override // defpackage.e41
    public int c() {
        return this.c;
    }

    @Override // defpackage.e41
    public ClipData d() {
        return this.b;
    }

    @Override // defpackage.e41
    public int e() {
        return this.d;
    }

    @Override // defpackage.e41
    public ContentInfo f() {
        return null;
    }

    @Override // defpackage.c41
    public void setExtras(Bundle bundle) {
        this.f = bundle;
    }

    public String toString() {
        String str;
        switch (this.a) {
            case 1:
                Uri uri = this.e;
                StringBuilder sb = new StringBuilder("ContentInfoCompat{clip=");
                sb.append(this.b.getDescription());
                sb.append(", source=");
                int i = this.c;
                sb.append(i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? String.valueOf(i) : "SOURCE_PROCESS_TEXT" : "SOURCE_AUTOFILL" : "SOURCE_DRAG_AND_DROP" : "SOURCE_INPUT_METHOD" : "SOURCE_CLIPBOARD" : "SOURCE_APP");
                sb.append(", flags=");
                int i2 = this.d;
                sb.append((i2 & 1) != 0 ? "FLAG_CONVERT_TO_PLAIN_TEXT" : String.valueOf(i2));
                if (uri == null) {
                    str = "";
                } else {
                    str = ", hasLinkUri(" + uri.toString().length() + ")";
                }
                sb.append(str);
                return dw1.s(sb, this.f != null ? ", hasExtras" : "", "}");
            default:
                return super.toString();
        }
    }

    public d41(d41 d41Var) {
        ClipData clipData = d41Var.b;
        clipData.getClass();
        this.b = clipData;
        int i = d41Var.c;
        if (i < 0) {
            Locale locale = Locale.US;
            throw new IllegalArgumentException("source is out of range of [0, 5] (too low)");
        }
        if (i > 5) {
            Locale locale2 = Locale.US;
            throw new IllegalArgumentException("source is out of range of [0, 5] (too high)");
        }
        this.c = i;
        int i2 = d41Var.d;
        if ((i2 & 1) == i2) {
            this.d = i2;
            this.e = d41Var.e;
            this.f = d41Var.f;
        } else {
            throw new IllegalArgumentException("Requested flags 0x" + Integer.toHexString(i2) + ", but only 0x" + Integer.toHexString(1) + " are allowed");
        }
    }
}
