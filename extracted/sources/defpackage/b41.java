package defpackage;

import android.content.ClipData;
import android.media.metrics.LogSessionId;
import android.net.Uri;
import android.os.Bundle;
import android.view.ContentInfo;

/* JADX INFO: loaded from: classes.dex */
public final class b41 implements c41, e41 {
    public final /* synthetic */ int a;
    public Object b;

    public b41() {
        this.a = 2;
        this.b = LogSessionId.LOG_SESSION_ID_NONE;
    }

    @Override // defpackage.c41
    public void a(Uri uri) {
        ((ContentInfo.Builder) this.b).setLinkUri(uri);
    }

    @Override // defpackage.c41
    public void b(int i) {
        ((ContentInfo.Builder) this.b).setFlags(i);
    }

    @Override // defpackage.c41
    public f41 build() {
        return new f41(new b41(((ContentInfo.Builder) this.b).build()));
    }

    @Override // defpackage.e41
    public int c() {
        return ((ContentInfo) this.b).getSource();
    }

    @Override // defpackage.e41
    public ClipData d() {
        return ((ContentInfo) this.b).getClip();
    }

    @Override // defpackage.e41
    public int e() {
        return ((ContentInfo) this.b).getFlags();
    }

    @Override // defpackage.e41
    public ContentInfo f() {
        return (ContentInfo) this.b;
    }

    public void g(LogSessionId logSessionId) {
        vy2.s(((LogSessionId) this.b).equals(LogSessionId.LOG_SESSION_ID_NONE));
        this.b = logSessionId;
    }

    @Override // defpackage.c41
    public void setExtras(Bundle bundle) {
        ((ContentInfo.Builder) this.b).setExtras(bundle);
    }

    public String toString() {
        switch (this.a) {
            case 1:
                return "ContentInfoCompat{" + ((ContentInfo) this.b) + "}";
            default:
                return super.toString();
        }
    }

    public b41(ContentInfo contentInfo) {
        this.a = 1;
        contentInfo.getClass();
        this.b = contentInfo;
    }

    public b41(ClipData clipData, int i) {
        this.a = 0;
        this.b = a41.b(clipData, i);
    }
}
