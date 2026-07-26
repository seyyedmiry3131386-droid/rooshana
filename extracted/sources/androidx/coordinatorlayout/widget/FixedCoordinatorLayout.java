package androidx.coordinatorlayout.widget;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.circularreveal.coordinatorlayout.CircularRevealCoordinatorLayout;
import defpackage.w08;

/* JADX INFO: loaded from: classes.dex */
public class FixedCoordinatorLayout extends CircularRevealCoordinatorLayout {

    public static class SavedStateWrapper implements Parcelable {
        public static final Parcelable.Creator<SavedStateWrapper> CREATOR = new w08(new e());
        public CoordinatorLayout.SavedState a;

        @Override // android.os.Parcelable
        public final int describeContents() {
            this.a.getClass();
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            this.a.writeToParcel(parcel, i);
        }
    }

    public FixedCoordinatorLayout(Context context) {
        super(context);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState(((SavedStateWrapper) parcelable).a);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View
    public final Parcelable onSaveInstanceState() {
        CoordinatorLayout.SavedState savedState = (CoordinatorLayout.SavedState) super.onSaveInstanceState();
        SavedStateWrapper savedStateWrapper = new SavedStateWrapper();
        savedStateWrapper.a = savedState;
        return savedStateWrapper;
    }

    public FixedCoordinatorLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
