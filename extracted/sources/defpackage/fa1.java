package defpackage;

import android.R;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.databinding.DataBinderMapperImpl;
import ir.mservices.market.activity.BaseNavigationContentActivity;

/* JADX INFO: loaded from: classes.dex */
public abstract class fa1 {
    public static final DataBinderMapperImpl a = new DataBinderMapperImpl();

    public static a79 a(View view) {
        int i = a79.r;
        a79 a79Var = view != null ? (a79) view.getTag(as6.dataBinding) : null;
        if (a79Var != null) {
            return a79Var;
        }
        Object tag = view.getTag();
        if (!(tag instanceof String)) {
            throw new IllegalArgumentException("View is not a binding layout");
        }
        DataBinderMapperImpl dataBinderMapperImpl = a;
        int iD = dataBinderMapperImpl.d((String) tag);
        if (iD != 0) {
            return dataBinderMapperImpl.b(iD, view);
        }
        throw new IllegalArgumentException(o40.x(tag, "View is not a binding layout. Tag: "));
    }

    public static a79 b(ViewGroup viewGroup, int i, int i2) {
        int childCount = viewGroup.getChildCount();
        int i3 = childCount - i;
        DataBinderMapperImpl dataBinderMapperImpl = a;
        if (i3 == 1) {
            return dataBinderMapperImpl.b(i2, viewGroup.getChildAt(childCount - 1));
        }
        View[] viewArr = new View[i3];
        for (int i4 = 0; i4 < i3; i4++) {
            viewArr[i4] = viewGroup.getChildAt(i4 + i);
        }
        return dataBinderMapperImpl.c(i2, viewArr);
    }

    public static a79 c(LayoutInflater layoutInflater, int i, ViewGroup viewGroup, boolean z) {
        boolean z2 = viewGroup != null && z;
        return z2 ? b(viewGroup, z2 ? viewGroup.getChildCount() : 0, i) : a.b(i, layoutInflater.inflate(i, viewGroup, z));
    }

    public static a79 d(BaseNavigationContentActivity baseNavigationContentActivity, int i) {
        baseNavigationContentActivity.setContentView(i);
        return b((ViewGroup) baseNavigationContentActivity.getWindow().getDecorView().findViewById(R.id.content), 0, i);
    }
}
