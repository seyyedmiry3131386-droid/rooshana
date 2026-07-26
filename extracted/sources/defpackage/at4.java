package defpackage;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import java.io.File;
import java.io.FileNotFoundException;

/* JADX INFO: loaded from: classes.dex */
public final class at4 implements la1 {
    public static final String[] d = {"_data"};
    public final /* synthetic */ int a;
    public final Object b;
    public final Object c;

    public /* synthetic */ at4(Object obj, Object obj2, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // defpackage.la1
    public final void c() {
        int i = this.a;
    }

    @Override // defpackage.la1
    public final void cancel() {
        int i = this.a;
    }

    @Override // defpackage.la1
    public final DataSource d() {
        switch (this.a) {
        }
        return DataSource.a;
    }

    @Override // defpackage.la1
    public final void e(Priority priority, ka1 ka1Var) {
        switch (this.a) {
            case 0:
                Cursor cursorQuery = ((Context) this.b).getContentResolver().query((Uri) this.c, d, null, null, null);
                if (cursorQuery != null) {
                    try {
                        string = cursorQuery.moveToFirst() ? cursorQuery.getString(cursorQuery.getColumnIndexOrThrow("_data")) : null;
                        cursorQuery.close();
                    } catch (Throwable th) {
                        cursorQuery.close();
                        throw th;
                    }
                    break;
                }
                if (!TextUtils.isEmpty(string)) {
                    ka1Var.f(new File(string));
                    return;
                }
                ka1Var.a(new FileNotFoundException("Failed to find file path for: " + ((Uri) this.c)));
                return;
            default:
                ka1Var.f(((wi0) this.c).n((byte[]) this.b));
                return;
        }
    }

    @Override // defpackage.la1
    public final Class getDataClass() {
        switch (this.a) {
            case 0:
                return File.class;
            default:
                return ((wi0) this.c).getDataClass();
        }
    }

    private final void a() {
    }

    private final void b() {
    }

    private final void f() {
    }

    private final void g() {
    }
}
