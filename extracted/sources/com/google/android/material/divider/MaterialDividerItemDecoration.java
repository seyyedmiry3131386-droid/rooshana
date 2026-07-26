package com.google.android.material.divider;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.ShapeDrawable;
import android.util.AttributeSet;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.g;
import androidx.recyclerview.widget.h;
import defpackage.b07;
import defpackage.bl4;
import defpackage.ja1;
import defpackage.mt6;
import defpackage.oq6;
import defpackage.vj8;
import defpackage.vp6;
import defpackage.yt6;

/* JADX INFO: loaded from: classes.dex */
public class MaterialDividerItemDecoration extends h {
    public static final int i = mt6.Widget_MaterialComponents_MaterialDivider;
    public final ShapeDrawable a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final boolean g;
    public final Rect h;

    public MaterialDividerItemDecoration(Context context, AttributeSet attributeSet, int i2) {
        int i3 = vp6.materialDividerStyle;
        this.h = new Rect();
        TypedArray typedArrayD = vj8.d(context, attributeSet, yt6.MaterialDivider, i3, i, new int[0]);
        this.c = ja1.r(context, typedArrayD, yt6.MaterialDivider_dividerColor).getDefaultColor();
        this.b = typedArrayD.getDimensionPixelSize(yt6.MaterialDivider_dividerThickness, context.getResources().getDimensionPixelSize(oq6.material_divider_thickness));
        this.e = typedArrayD.getDimensionPixelOffset(yt6.MaterialDivider_dividerInsetStart, 0);
        this.f = typedArrayD.getDimensionPixelOffset(yt6.MaterialDivider_dividerInsetEnd, 0);
        this.g = typedArrayD.getBoolean(yt6.MaterialDivider_lastItemDecorated, true);
        typedArrayD.recycle();
        ShapeDrawable shapeDrawable = new ShapeDrawable();
        int i4 = this.c;
        this.c = i4;
        this.a = shapeDrawable;
        shapeDrawable.setTint(i4);
        if (i2 != 0 && i2 != 1) {
            throw new IllegalArgumentException(bl4.q(i2, "Invalid orientation: ", ". It should be either HORIZONTAL or VERTICAL"));
        }
        this.d = i2;
    }

    @Override // androidx.recyclerview.widget.h
    public final void a(Rect rect, View view, RecyclerView recyclerView, b07 b07Var) {
        rect.set(0, 0, 0, 0);
        if (d(recyclerView, view)) {
            int i2 = this.d;
            int i3 = this.b;
            if (i2 == 1) {
                rect.bottom = i3;
            } else if (recyclerView.getLayoutDirection() == 1) {
                rect.left = i3;
            } else {
                rect.right = i3;
            }
        }
    }

    @Override // androidx.recyclerview.widget.h
    public final void b(Canvas canvas, RecyclerView recyclerView) {
        int height;
        int paddingTop;
        boolean z;
        int i2;
        int i3;
        int width;
        int paddingLeft;
        if (recyclerView.getLayoutManager() == null) {
            return;
        }
        int i4 = this.d;
        int i5 = this.b;
        int i6 = 0;
        int i7 = this.f;
        int i8 = this.e;
        Rect rect = this.h;
        if (i4 == 1) {
            canvas.save();
            if (recyclerView.getClipToPadding()) {
                paddingLeft = recyclerView.getPaddingLeft();
                width = recyclerView.getWidth() - recyclerView.getPaddingRight();
                canvas.clipRect(paddingLeft, recyclerView.getPaddingTop(), width, recyclerView.getHeight() - recyclerView.getPaddingBottom());
            } else {
                width = recyclerView.getWidth();
                paddingLeft = 0;
            }
            z = recyclerView.getLayoutDirection() == 1;
            int i9 = paddingLeft + (z ? i7 : i8);
            if (z) {
                i7 = i8;
            }
            int i10 = width - i7;
            int childCount = recyclerView.getChildCount();
            while (i6 < childCount) {
                View childAt = recyclerView.getChildAt(i6);
                if (d(recyclerView, childAt)) {
                    recyclerView.getLayoutManager().z(rect, childAt);
                    int iRound = Math.round(childAt.getTranslationY()) + rect.bottom;
                    this.a.setBounds(i9, iRound - i5, i10, iRound);
                    this.a.setAlpha(Math.round(childAt.getAlpha() * 255.0f));
                    this.a.draw(canvas);
                }
                i6++;
            }
            canvas.restore();
            return;
        }
        canvas.save();
        if (recyclerView.getClipToPadding()) {
            paddingTop = recyclerView.getPaddingTop();
            height = recyclerView.getHeight() - recyclerView.getPaddingBottom();
            canvas.clipRect(recyclerView.getPaddingLeft(), paddingTop, recyclerView.getWidth() - recyclerView.getPaddingRight(), height);
        } else {
            height = recyclerView.getHeight();
            paddingTop = 0;
        }
        int i11 = paddingTop + i8;
        int i12 = height - i7;
        z = recyclerView.getLayoutDirection() == 1;
        int childCount2 = recyclerView.getChildCount();
        while (i6 < childCount2) {
            View childAt2 = recyclerView.getChildAt(i6);
            if (d(recyclerView, childAt2)) {
                recyclerView.getLayoutManager().z(rect, childAt2);
                int iRound2 = Math.round(childAt2.getTranslationX());
                if (z) {
                    i3 = rect.left + iRound2;
                    i2 = i3 + i5;
                } else {
                    i2 = iRound2 + rect.right;
                    i3 = i2 - i5;
                }
                this.a.setBounds(i3, i11, i2, i12);
                this.a.setAlpha(Math.round(childAt2.getAlpha() * 255.0f));
                this.a.draw(canvas);
            }
            i6++;
        }
        canvas.restore();
    }

    public final boolean d(RecyclerView recyclerView, View view) {
        int iM = RecyclerView.M(view);
        g adapter = recyclerView.getAdapter();
        return iM != -1 && (!(adapter != null && iM == adapter.c() - 1) || this.g);
    }
}
