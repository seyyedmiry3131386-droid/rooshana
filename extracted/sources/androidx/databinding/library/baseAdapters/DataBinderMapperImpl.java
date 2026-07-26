package androidx.databinding.library.baseAdapters;

import android.util.SparseIntArray;
import android.view.View;
import defpackage.a79;
import defpackage.ba1;
import defpackage.da1;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class DataBinderMapperImpl extends ba1 {
    public static final SparseIntArray a = new SparseIntArray(0);

    @Override // defpackage.ba1
    public final List a() {
        return new ArrayList(0);
    }

    @Override // defpackage.ba1
    public final a79 b(int i, View view) {
        if (a.get(i) <= 0 || view.getTag() != null) {
            return null;
        }
        throw new RuntimeException("view must have a tag");
    }

    @Override // defpackage.ba1
    public final a79 c(int i, View[] viewArr) {
        if (viewArr.length != 0 && a.get(i) > 0 && viewArr[0].getTag() == null) {
            throw new RuntimeException("view must have a tag");
        }
        return null;
    }

    @Override // defpackage.ba1
    public final int d(String str) {
        Integer num = (Integer) da1.a.get(str);
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }
}
