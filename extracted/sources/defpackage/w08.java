package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.runtime.snapshots.SnapshotStateSet;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.coordinatorlayout.widget.FixedCoordinatorLayout;
import androidx.coordinatorlayout.widget.e;
import androidx.customview.view.AbsSavedState;
import androidx.fragment.app.Fragment$SavedState;
import com.google.android.material.internal.ParcelableSparseArray;
import com.google.android.material.stateful.ExtendableSavedState;
import ir.mservices.market.version2.ApplicationLauncher;

/* JADX INFO: loaded from: classes.dex */
public final class w08 implements Parcelable.ClassLoaderCreator {
    public final /* synthetic */ int a;

    public /* synthetic */ w08(int i) {
        this.a = i;
    }

    public static SnapshotStateList a(Parcel parcel, ClassLoader classLoader) {
        if (classLoader == null) {
            classLoader = w08.class.getClassLoader();
        }
        int i = parcel.readInt();
        if (i == 0) {
            return new SnapshotStateList();
        }
        v66 v66VarH = lz7.b.h();
        for (int i2 = 0; i2 < i; i2++) {
            v66VarH.add(parcel.readValue(classLoader));
        }
        return new SnapshotStateList(v66VarH.e());
    }

    public static SnapshotStateSet b(Parcel parcel, ClassLoader classLoader) {
        SnapshotStateSet snapshotStateSet = new SnapshotStateSet();
        o66 o66Var = o66.d;
        l58 l58Var = new l58(g08.j().g(), o66Var);
        if (g08.b.s() != null) {
            l58Var.b = new l58(1, o66Var);
        }
        snapshotStateSet.a = l58Var;
        if (classLoader == null) {
            classLoader = SnapshotStateSet.class.getClassLoader();
        }
        int i = parcel.readInt();
        for (int i2 = 0; i2 < i; i2++) {
            snapshotStateSet.add(parcel.readValue(classLoader));
        }
        return snapshotStateSet;
    }

    @Override // android.os.Parcelable.ClassLoaderCreator
    public final Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        switch (this.a) {
            case 0:
                return a(parcel, classLoader);
            case 1:
                if (parcel.readParcelable(classLoader) == null) {
                    return AbsSavedState.b;
                }
                throw new IllegalStateException("superState must be null");
            case 2:
                return new ExtendableSavedState(parcel, classLoader);
            case 3:
                return new Fragment$SavedState(parcel, classLoader);
            case 4:
                FixedCoordinatorLayout.SavedStateWrapper savedStateWrapper = new FixedCoordinatorLayout.SavedStateWrapper();
                if (classLoader == null) {
                    classLoader = ApplicationLauncher.class.getClassLoader();
                }
                savedStateWrapper.a = new CoordinatorLayout.SavedState(parcel, classLoader);
                return savedStateWrapper;
            case 5:
                return new ParcelableSparseArray(parcel, classLoader);
            default:
                return b(parcel, classLoader);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new SnapshotStateList[i];
            case 1:
                return new AbsSavedState[i];
            case 2:
                return new ExtendableSavedState[i];
            case 3:
                return new Fragment$SavedState[i];
            case 4:
                return new FixedCoordinatorLayout.SavedStateWrapper[i];
            case 5:
                return new ParcelableSparseArray[i];
            default:
                return new SnapshotStateSet[i];
        }
    }

    public w08(e eVar) {
        this.a = 4;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.a) {
            case 0:
                return a(parcel, null);
            case 1:
                if (parcel.readParcelable(null) == null) {
                    return AbsSavedState.b;
                }
                throw new IllegalStateException("superState must be null");
            case 2:
                return new ExtendableSavedState(parcel, null);
            case 3:
                return new Fragment$SavedState(parcel, null);
            case 4:
                FixedCoordinatorLayout.SavedStateWrapper savedStateWrapper = new FixedCoordinatorLayout.SavedStateWrapper();
                savedStateWrapper.a = new CoordinatorLayout.SavedState(parcel, ApplicationLauncher.class.getClassLoader());
                return savedStateWrapper;
            case 5:
                return new ParcelableSparseArray(parcel, null);
            default:
                return b(parcel, null);
        }
    }
}
