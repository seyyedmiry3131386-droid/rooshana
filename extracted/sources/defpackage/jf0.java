package defpackage;

import android.view.GestureDetector;
import android.view.MotionEvent;
import androidx.appcompat.widget.AppCompatImageView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.bottomsheet.BottomSheetDragHandleView;
import com.jsibbold.zoomage.ZoomageView;

/* JADX INFO: loaded from: classes.dex */
public final class jf0 extends GestureDetector.SimpleOnGestureListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ AppCompatImageView b;

    public /* synthetic */ jf0(AppCompatImageView appCompatImageView, int i) {
        this.a = i;
        this.b = appCompatImageView;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public boolean onDoubleTap(MotionEvent motionEvent) {
        switch (this.a) {
            case 0:
                BottomSheetBehavior bottomSheetBehavior = ((BottomSheetDragHandleView) this.b).e;
                if (bottomSheetBehavior != null && bottomSheetBehavior.I) {
                    bottomSheetBehavior.O(5);
                }
                break;
        }
        return super.onDoubleTap(motionEvent);
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public boolean onDoubleTapEvent(MotionEvent motionEvent) {
        switch (this.a) {
            case 1:
                ZoomageView zoomageView = (ZoomageView) this.b;
                if (motionEvent.getAction() == 1) {
                    zoomageView.E = true;
                }
                zoomageView.F = false;
                return false;
            default:
                return super.onDoubleTapEvent(motionEvent);
        }
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        switch (this.a) {
            case 0:
                return ((BottomSheetDragHandleView) this.b).isClickable();
            default:
                return true;
        }
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        int i = this.a;
        AppCompatImageView appCompatImageView = this.b;
        switch (i) {
            case 0:
                int i2 = BottomSheetDragHandleView.m;
                return ((BottomSheetDragHandleView) appCompatImageView).c();
            default:
                ((ZoomageView) appCompatImageView).F = false;
                return false;
        }
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onSingleTapUp(MotionEvent motionEvent) {
        switch (this.a) {
            case 1:
                ((ZoomageView) this.b).F = true;
                return false;
            default:
                return super.onSingleTapUp(motionEvent);
        }
    }
}
