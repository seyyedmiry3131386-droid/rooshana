package defpackage;

import com.bumptech.glide.load.DataSource;

/* JADX INFO: loaded from: classes.dex */
public final class zo1 {
    public static final zo1 b = new zo1(0);
    public static final zo1 c = new zo1(1);
    public static final zo1 d = new zo1(2);
    public final /* synthetic */ int a;

    public /* synthetic */ zo1(int i) {
        this.a = i;
    }

    public final boolean a(DataSource dataSource) {
        switch (this.a) {
            case 0:
                break;
            case 1:
                if (dataSource == DataSource.c || dataSource == DataSource.e) {
                }
                break;
            default:
                if (dataSource == DataSource.b) {
                }
                break;
        }
        return false;
    }
}
