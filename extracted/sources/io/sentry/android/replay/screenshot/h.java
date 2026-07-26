package io.sentry.android.replay.screenshot;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.BlendMode;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.DrawFilter;
import android.graphics.Matrix;
import android.graphics.Mesh;
import android.graphics.NinePatch;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Picture;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.RenderNode;
import android.graphics.Shader;
import android.graphics.fonts.Font;
import android.graphics.text.MeasuredText;
import android.os.Build;
import defpackage.js3;
import ir.mservices.market.version2.webapi.responsedto.ConfirmDTO;
import java.util.WeakHashMap;
import kotlin.Pair;

/* JADX INFO: loaded from: classes3.dex */
public final class h extends Canvas {
    public Canvas a;
    public final Paint b = new Paint();
    public final Paint c = new Paint();
    public final Rect d = new Rect();
    public final Bitmap e;
    public final Canvas f;
    public final Rect g;
    public final WeakHashMap h;

    public h() {
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(1, 1, Bitmap.Config.ARGB_8888);
        js3.o(bitmapCreateBitmap, "createBitmap(...)");
        this.e = bitmapCreateBitmap;
        this.f = new Canvas(bitmapCreateBitmap);
        this.g = new Rect(0, 0, 1, 1);
        this.h = new WeakHashMap();
    }

    public static BitmapShader c(Paint paint) {
        if (paint != null) {
            Shader shader = paint.getShader();
            if (shader instanceof BitmapShader) {
                paint.setShader(null);
                return (BitmapShader) shader;
            }
        }
        return null;
    }

    public final void a(float f, float f2, Paint paint) {
        ColorFilter colorFilter = paint.getColorFilter();
        Paint paint2 = this.c;
        paint2.setColorFilter(colorFilter);
        int color = paint.getColor();
        paint2.setColor(Color.argb(100, Color.red(color), Color.green(color), Color.blue(color)));
        Rect rect = this.d;
        drawRoundRect(rect.left + f, rect.top + f2, rect.right + f, rect.bottom + f2, 10.0f, 10.0f, paint2);
    }

    public final Canvas b() {
        Canvas canvas = this.a;
        if (canvas != null) {
            return canvas;
        }
        js3.V("delegate");
        throw null;
    }

    @Override // android.graphics.Canvas
    public final boolean clipOutPath(Path path) {
        js3.p(path, "path");
        return b().clipOutPath(path);
    }

    @Override // android.graphics.Canvas
    public final boolean clipOutRect(RectF rectF) {
        js3.p(rectF, "rect");
        return b().clipOutRect(rectF);
    }

    @Override // android.graphics.Canvas
    public final boolean clipPath(Path path, Region.Op op) {
        js3.p(path, "path");
        js3.p(op, "op");
        return b().clipPath(path, op);
    }

    @Override // android.graphics.Canvas
    public final boolean clipRect(RectF rectF, Region.Op op) {
        js3.p(rectF, "rect");
        js3.p(op, "op");
        return b().clipRect(rectF, op);
    }

    @Override // android.graphics.Canvas
    public final void concat(Matrix matrix) {
        b().concat(matrix);
    }

    public final int d(Bitmap bitmap, Paint paint, Rect rect) {
        int pixel = -16777216;
        if (bitmap.isRecycled()) {
            return -16777216;
        }
        WeakHashMap weakHashMap = this.h;
        Pair pair = (Pair) weakHashMap.get(bitmap);
        if (pair != null && ((Number) pair.a).intValue() == bitmap.getGenerationId()) {
            return ((Number) pair.b).intValue();
        }
        Bitmap.Config config = bitmap.getConfig();
        Bitmap.Config config2 = Bitmap.Config.HARDWARE;
        Bitmap bitmap2 = this.e;
        Rect rect2 = this.g;
        Canvas canvas = this.f;
        if (config == config2 && Build.VERSION.SDK_INT >= 31) {
            BitmapShader bitmapShaderC = c(paint);
            canvas.drawBitmap(bitmap.asShared(), rect, rect2, paint);
            if (bitmapShaderC != null && paint != null) {
                paint.setShader(bitmapShaderC);
            }
            pixel = bitmap2.getPixel(0, 0);
        } else if (bitmap.getConfig() != config2) {
            BitmapShader bitmapShaderC2 = c(paint);
            canvas.drawBitmap(bitmap, rect, rect2, paint);
            if (bitmapShaderC2 != null && paint != null) {
                paint.setShader(bitmapShaderC2);
            }
            pixel = bitmap2.getPixel(0, 0);
        }
        weakHashMap.put(bitmap, new Pair(Integer.valueOf(bitmap.getGenerationId()), Integer.valueOf(pixel)));
        return pixel;
    }

    @Override // android.graphics.Canvas
    public final void disableZ() {
        b().disableZ();
    }

    @Override // android.graphics.Canvas
    public final void drawARGB(int i, int i2, int i3, int i4) {
        b().drawARGB(i, i2, i3, i4);
    }

    @Override // android.graphics.Canvas
    public final void drawArc(RectF rectF, float f, float f2, boolean z, Paint paint) {
        js3.p(rectF, "oval");
        js3.p(paint, "paint");
        BitmapShader bitmapShaderC = c(paint);
        b().drawArc(rectF, f, f2, z, paint);
        paint.setShader(bitmapShaderC);
    }

    @Override // android.graphics.Canvas
    public final void drawBitmap(int[] iArr, int i, int i2, float f, float f2, int i3, int i4, boolean z, Paint paint) {
        js3.p(iArr, "colors");
    }

    @Override // android.graphics.Canvas
    public final void drawBitmapMesh(Bitmap bitmap, int i, int i2, float[] fArr, int i3, int[] iArr, int i4, Paint paint) {
        js3.p(bitmap, "bitmap");
        js3.p(fArr, "verts");
    }

    @Override // android.graphics.Canvas
    public final void drawCircle(float f, float f2, float f3, Paint paint) {
        js3.p(paint, "paint");
        BitmapShader bitmapShaderC = c(paint);
        b().drawCircle(f, f2, f3, paint);
        paint.setShader(bitmapShaderC);
    }

    @Override // android.graphics.Canvas
    public final void drawColor(int i) {
        b().drawColor(i);
    }

    @Override // android.graphics.Canvas
    public final void drawDoubleRoundRect(RectF rectF, float f, float f2, RectF rectF2, float f3, float f4, Paint paint) {
        js3.p(rectF, "outer");
        js3.p(rectF2, "inner");
        js3.p(paint, "paint");
        BitmapShader bitmapShaderC = c(paint);
        b().drawDoubleRoundRect(rectF, f, f2, rectF2, f3, f4, paint);
        paint.setShader(bitmapShaderC);
    }

    @Override // android.graphics.Canvas
    public final void drawGlyphs(int[] iArr, int i, float[] fArr, int i2, int i3, Font font, Paint paint) {
        js3.p(iArr, "glyphIds");
        js3.p(fArr, "positions");
        js3.p(font, "font");
        js3.p(paint, "paint");
    }

    @Override // android.graphics.Canvas
    public final void drawLine(float f, float f2, float f3, float f4, Paint paint) {
        js3.p(paint, "paint");
        BitmapShader bitmapShaderC = c(paint);
        b().drawLine(f, f2, f3, f4, paint);
        paint.setShader(bitmapShaderC);
    }

    @Override // android.graphics.Canvas
    public final void drawLines(float[] fArr, int i, int i2, Paint paint) {
        js3.p(fArr, "pts");
        js3.p(paint, "paint");
        BitmapShader bitmapShaderC = c(paint);
        b().drawLines(fArr, i, i2, paint);
        paint.setShader(bitmapShaderC);
    }

    @Override // android.graphics.Canvas
    public final void drawMesh(Mesh mesh, BlendMode blendMode, Paint paint) {
        js3.p(mesh, "mesh");
        js3.p(paint, "paint");
    }

    @Override // android.graphics.Canvas
    public final void drawOval(RectF rectF, Paint paint) {
        js3.p(rectF, "oval");
        js3.p(paint, "paint");
        BitmapShader bitmapShaderC = c(paint);
        b().drawOval(rectF, paint);
        paint.setShader(bitmapShaderC);
    }

    @Override // android.graphics.Canvas
    public final void drawPaint(Paint paint) {
        js3.p(paint, "paint");
        BitmapShader bitmapShaderC = c(paint);
        b().drawPaint(paint);
        paint.setShader(bitmapShaderC);
    }

    @Override // android.graphics.Canvas
    public final void drawPatch(NinePatch ninePatch, Rect rect, Paint paint) {
        js3.p(ninePatch, "patch");
        js3.p(rect, "dst");
        BitmapShader bitmapShaderC = c(paint);
        b().drawPatch(ninePatch, rect, paint);
        if (paint == null) {
            return;
        }
        paint.setShader(bitmapShaderC);
    }

    @Override // android.graphics.Canvas
    public final void drawPath(Path path, Paint paint) {
        js3.p(path, "path");
        js3.p(paint, "paint");
        BitmapShader bitmapShaderC = c(paint);
        b().drawPath(path, paint);
        paint.setShader(bitmapShaderC);
    }

    @Override // android.graphics.Canvas
    public final void drawPicture(Picture picture) {
        js3.p(picture, "picture");
        Paint paint = this.b;
        paint.setColorFilter(null);
        paint.setColor(-16777216);
        b().drawRect(0.0f, 0.0f, picture.getWidth(), picture.getHeight(), paint);
    }

    @Override // android.graphics.Canvas
    public final void drawPoint(float f, float f2, Paint paint) {
        js3.p(paint, "paint");
        BitmapShader bitmapShaderC = c(paint);
        b().drawPoint(f, f2, paint);
        paint.setShader(bitmapShaderC);
    }

    @Override // android.graphics.Canvas
    public final void drawPoints(float[] fArr, int i, int i2, Paint paint) {
        js3.p(paint, "paint");
        BitmapShader bitmapShaderC = c(paint);
        b().drawPoints(fArr, i, i2, paint);
        paint.setShader(bitmapShaderC);
    }

    @Override // android.graphics.Canvas
    public final void drawPosText(String str, float[] fArr, Paint paint) {
        js3.p(str, ConfirmDTO.INPUT_TYPE_TEXT);
        js3.p(fArr, "pos");
        js3.p(paint, "paint");
    }

    @Override // android.graphics.Canvas
    public final void drawRGB(int i, int i2, int i3) {
        b().drawRGB(i, i2, i3);
    }

    @Override // android.graphics.Canvas
    public final void drawRect(RectF rectF, Paint paint) {
        js3.p(rectF, "rect");
        js3.p(paint, "paint");
        BitmapShader bitmapShaderC = c(paint);
        b().drawRect(rectF, paint);
        paint.setShader(bitmapShaderC);
    }

    @Override // android.graphics.Canvas
    public final void drawRenderNode(RenderNode renderNode) {
        js3.p(renderNode, "renderNode");
    }

    @Override // android.graphics.Canvas
    public final void drawRoundRect(RectF rectF, float f, float f2, Paint paint) {
        js3.p(rectF, "rect");
        js3.p(paint, "paint");
        BitmapShader bitmapShaderC = c(paint);
        b().drawRoundRect(rectF, f, f2, paint);
        paint.setShader(bitmapShaderC);
    }

    @Override // android.graphics.Canvas
    public final void drawText(char[] cArr, int i, int i2, float f, float f2, Paint paint) {
        js3.p(cArr, ConfirmDTO.INPUT_TYPE_TEXT);
        js3.p(paint, "paint");
        paint.getTextBounds(cArr, i, i2, this.d);
        a(f, f2, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawTextOnPath(String str, Path path, float f, float f2, Paint paint) {
        js3.p(str, ConfirmDTO.INPUT_TYPE_TEXT);
        js3.p(path, "path");
        js3.p(paint, "paint");
    }

    @Override // android.graphics.Canvas
    public final void drawTextRun(char[] cArr, int i, int i2, int i3, int i4, float f, float f2, boolean z, Paint paint) {
        js3.p(cArr, ConfirmDTO.INPUT_TYPE_TEXT);
        js3.p(paint, "paint");
        paint.getTextBounds(cArr, 0, i + i2, this.d);
        a(f, f2, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawVertices(Canvas.VertexMode vertexMode, int i, float[] fArr, int i2, float[] fArr2, int i3, int[] iArr, int i4, short[] sArr, int i5, int i6, Paint paint) {
        js3.p(vertexMode, "mode");
        js3.p(fArr, "verts");
        js3.p(paint, "paint");
    }

    @Override // android.graphics.Canvas
    public final void enableZ() {
        b().enableZ();
    }

    @Override // android.graphics.Canvas
    public final boolean getClipBounds(Rect rect) {
        js3.p(rect, "bounds");
        return b().getClipBounds(rect);
    }

    @Override // android.graphics.Canvas
    public final int getDensity() {
        return b().getDensity();
    }

    @Override // android.graphics.Canvas
    public final DrawFilter getDrawFilter() {
        return b().getDrawFilter();
    }

    @Override // android.graphics.Canvas
    public final int getHeight() {
        return b().getHeight();
    }

    @Override // android.graphics.Canvas
    public final void getMatrix(Matrix matrix) {
        js3.p(matrix, "ctm");
        b().getMatrix(matrix);
    }

    @Override // android.graphics.Canvas
    public final int getMaximumBitmapHeight() {
        return b().getMaximumBitmapHeight();
    }

    @Override // android.graphics.Canvas
    public final int getMaximumBitmapWidth() {
        return b().getMaximumBitmapWidth();
    }

    @Override // android.graphics.Canvas
    public final int getSaveCount() {
        return b().getSaveCount();
    }

    @Override // android.graphics.Canvas
    public final int getWidth() {
        return b().getWidth();
    }

    @Override // android.graphics.Canvas
    public final boolean isHardwareAccelerated() {
        return false;
    }

    @Override // android.graphics.Canvas
    public final boolean isOpaque() {
        return b().isOpaque();
    }

    @Override // android.graphics.Canvas
    public final boolean quickReject(RectF rectF, Canvas.EdgeType edgeType) {
        js3.p(rectF, "rect");
        js3.p(edgeType, "type");
        return b().quickReject(rectF, edgeType);
    }

    @Override // android.graphics.Canvas
    public final void restore() {
        b().restore();
    }

    @Override // android.graphics.Canvas
    public final void restoreToCount(int i) {
        b().restoreToCount(i);
    }

    @Override // android.graphics.Canvas
    public final void rotate(float f) {
        b().rotate(f);
    }

    @Override // android.graphics.Canvas
    public final int save() {
        return b().save();
    }

    @Override // android.graphics.Canvas
    public final int saveLayer(RectF rectF, Paint paint, int i) {
        BitmapShader bitmapShaderC = c(paint);
        int iSaveLayer = b().saveLayer(rectF, paint, i);
        if (paint == null) {
            return iSaveLayer;
        }
        paint.setShader(bitmapShaderC);
        return iSaveLayer;
    }

    @Override // android.graphics.Canvas
    public final int saveLayerAlpha(RectF rectF, int i, int i2) {
        return b().saveLayerAlpha(rectF, i, i2);
    }

    @Override // android.graphics.Canvas
    public final void scale(float f, float f2) {
        b().scale(f, f2);
    }

    @Override // android.graphics.Canvas
    public final void setBitmap(Bitmap bitmap) {
        b().setBitmap(bitmap);
    }

    @Override // android.graphics.Canvas
    public final void setDensity(int i) {
        b().setDensity(i);
    }

    @Override // android.graphics.Canvas
    public final void setDrawFilter(DrawFilter drawFilter) {
        b().setDrawFilter(drawFilter);
    }

    @Override // android.graphics.Canvas
    public final void setMatrix(Matrix matrix) {
        b().setMatrix(matrix);
    }

    @Override // android.graphics.Canvas
    public final void skew(float f, float f2) {
        b().skew(f, f2);
    }

    @Override // android.graphics.Canvas
    public final void translate(float f, float f2) {
        b().translate(f, f2);
    }

    @Override // android.graphics.Canvas
    public final boolean clipOutRect(Rect rect) {
        js3.p(rect, "rect");
        return b().clipOutRect(rect);
    }

    @Override // android.graphics.Canvas
    public final boolean clipPath(Path path) {
        js3.p(path, "path");
        return b().clipPath(path);
    }

    @Override // android.graphics.Canvas
    public final boolean clipRect(Rect rect, Region.Op op) {
        js3.p(rect, "rect");
        js3.p(op, "op");
        return b().clipRect(rect, op);
    }

    @Override // android.graphics.Canvas
    public final void drawBitmap(int[] iArr, int i, int i2, int i3, int i4, int i5, int i6, boolean z, Paint paint) {
        js3.p(iArr, "colors");
    }

    @Override // android.graphics.Canvas
    public final void drawColor(long j) {
        b().drawColor(j);
    }

    @Override // android.graphics.Canvas
    public final void drawPosText(char[] cArr, int i, int i2, float[] fArr, Paint paint) {
        js3.p(cArr, ConfirmDTO.INPUT_TYPE_TEXT);
        js3.p(fArr, "pos");
        js3.p(paint, "paint");
    }

    @Override // android.graphics.Canvas
    public final void drawTextOnPath(char[] cArr, int i, int i2, Path path, float f, float f2, Paint paint) {
        js3.p(cArr, ConfirmDTO.INPUT_TYPE_TEXT);
        js3.p(path, "path");
        js3.p(paint, "paint");
    }

    @Override // android.graphics.Canvas
    public final boolean quickReject(RectF rectF) {
        js3.p(rectF, "rect");
        return b().quickReject(rectF);
    }

    @Override // android.graphics.Canvas
    public final int saveLayerAlpha(RectF rectF, int i) {
        return b().saveLayerAlpha(rectF, i);
    }

    @Override // android.graphics.Canvas
    public final boolean clipOutRect(float f, float f2, float f3, float f4) {
        return b().clipOutRect(f, f2, f3, f4);
    }

    @Override // android.graphics.Canvas
    public final boolean clipRect(RectF rectF) {
        js3.p(rectF, "rect");
        return b().clipRect(rectF);
    }

    @Override // android.graphics.Canvas
    public final void drawBitmap(Bitmap bitmap, float f, float f2, Paint paint) {
        js3.p(bitmap, "bitmap");
        int iD = d(bitmap, paint, null);
        Paint paint2 = this.b;
        paint2.setColor(iD);
        paint2.setColorFilter(null);
        b().drawRect(f, f2, f + bitmap.getWidth(), f2 + bitmap.getHeight(), paint2);
    }

    @Override // android.graphics.Canvas
    public final void drawColor(int i, PorterDuff.Mode mode) {
        js3.p(mode, "mode");
        b().drawColor(i, mode);
    }

    @Override // android.graphics.Canvas
    public final void drawText(String str, float f, float f2, Paint paint) {
        js3.p(str, ConfirmDTO.INPUT_TYPE_TEXT);
        js3.p(paint, "paint");
        paint.getTextBounds(str, 0, str.length(), this.d);
        a(f, f2, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawTextRun(CharSequence charSequence, int i, int i2, int i3, int i4, float f, float f2, boolean z, Paint paint) {
        js3.p(charSequence, ConfirmDTO.INPUT_TYPE_TEXT);
        js3.p(paint, "paint");
        paint.getTextBounds(charSequence.toString(), i, i2, this.d);
        a(f, f2, paint);
    }

    @Override // android.graphics.Canvas
    public final boolean quickReject(Path path, Canvas.EdgeType edgeType) {
        js3.p(path, "path");
        js3.p(edgeType, "type");
        return b().quickReject(path, edgeType);
    }

    @Override // android.graphics.Canvas
    public final int saveLayerAlpha(float f, float f2, float f3, float f4, int i, int i2) {
        return b().saveLayerAlpha(f, f2, f3, f4, i, i2);
    }

    @Override // android.graphics.Canvas
    public final boolean clipOutRect(int i, int i2, int i3, int i4) {
        return b().clipOutRect(i, i2, i3, i4);
    }

    @Override // android.graphics.Canvas
    public final boolean clipRect(Rect rect) {
        js3.p(rect, "rect");
        return b().clipRect(rect);
    }

    @Override // android.graphics.Canvas
    public final void drawArc(float f, float f2, float f3, float f4, float f5, float f6, boolean z, Paint paint) {
        js3.p(paint, "paint");
        BitmapShader bitmapShaderC = c(paint);
        b().drawArc(f, f2, f3, f4, f5, f6, z, paint);
        paint.setShader(bitmapShaderC);
    }

    @Override // android.graphics.Canvas
    public final void drawColor(int i, BlendMode blendMode) {
        js3.p(blendMode, "mode");
        b().drawColor(i, blendMode);
    }

    @Override // android.graphics.Canvas
    public final void drawDoubleRoundRect(RectF rectF, float[] fArr, RectF rectF2, float[] fArr2, Paint paint) {
        js3.p(rectF, "outer");
        js3.p(fArr, "outerRadii");
        js3.p(rectF2, "inner");
        js3.p(fArr2, "innerRadii");
        js3.p(paint, "paint");
        BitmapShader bitmapShaderC = c(paint);
        b().drawDoubleRoundRect(rectF, fArr, rectF2, fArr2, paint);
        paint.setShader(bitmapShaderC);
    }

    @Override // android.graphics.Canvas
    public final void drawLines(float[] fArr, Paint paint) {
        js3.p(fArr, "pts");
        js3.p(paint, "paint");
        BitmapShader bitmapShaderC = c(paint);
        b().drawLines(fArr, paint);
        paint.setShader(bitmapShaderC);
    }

    @Override // android.graphics.Canvas
    public final void drawOval(float f, float f2, float f3, float f4, Paint paint) {
        js3.p(paint, "paint");
        BitmapShader bitmapShaderC = c(paint);
        b().drawOval(f, f2, f3, f4, paint);
        paint.setShader(bitmapShaderC);
    }

    @Override // android.graphics.Canvas
    public final void drawPatch(NinePatch ninePatch, RectF rectF, Paint paint) {
        js3.p(ninePatch, "patch");
        js3.p(rectF, "dst");
        BitmapShader bitmapShaderC = c(paint);
        b().drawPatch(ninePatch, rectF, paint);
        if (paint == null) {
            return;
        }
        paint.setShader(bitmapShaderC);
    }

    @Override // android.graphics.Canvas
    public final void drawPicture(Picture picture, RectF rectF) {
        js3.p(picture, "picture");
        js3.p(rectF, "dst");
        Paint paint = this.b;
        paint.setColorFilter(null);
        paint.setColor(-16777216);
        b().drawRect(rectF, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawPoints(float[] fArr, Paint paint) {
        js3.p(fArr, "pts");
        js3.p(paint, "paint");
        BitmapShader bitmapShaderC = c(paint);
        b().drawPoints(fArr, paint);
        paint.setShader(bitmapShaderC);
    }

    @Override // android.graphics.Canvas
    public final void drawRect(Rect rect, Paint paint) {
        js3.p(rect, "r");
        js3.p(paint, "paint");
        BitmapShader bitmapShaderC = c(paint);
        b().drawRect(rect, paint);
        paint.setShader(bitmapShaderC);
    }

    @Override // android.graphics.Canvas
    public final void drawRoundRect(float f, float f2, float f3, float f4, float f5, float f6, Paint paint) {
        js3.p(paint, "paint");
        BitmapShader bitmapShaderC = c(paint);
        b().drawRoundRect(f, f2, f3, f4, f5, f6, paint);
        paint.setShader(bitmapShaderC);
    }

    @Override // android.graphics.Canvas
    public final boolean quickReject(Path path) {
        js3.p(path, "path");
        return b().quickReject(path);
    }

    @Override // android.graphics.Canvas
    public final int saveLayer(RectF rectF, Paint paint) {
        BitmapShader bitmapShaderC = c(paint);
        int iSaveLayer = b().saveLayer(rectF, paint);
        if (paint == null) {
            return iSaveLayer;
        }
        paint.setShader(bitmapShaderC);
        return iSaveLayer;
    }

    @Override // android.graphics.Canvas
    public final int saveLayerAlpha(float f, float f2, float f3, float f4, int i) {
        return b().saveLayerAlpha(f, f2, f3, f4, i);
    }

    @Override // android.graphics.Canvas
    public final boolean clipRect(float f, float f2, float f3, float f4, Region.Op op) {
        js3.p(op, "op");
        return b().clipRect(f, f2, f3, f4, op);
    }

    @Override // android.graphics.Canvas
    public final void drawColor(long j, BlendMode blendMode) {
        js3.p(blendMode, "mode");
        b().drawColor(j, blendMode);
    }

    @Override // android.graphics.Canvas
    public final void drawText(String str, int i, int i2, float f, float f2, Paint paint) {
        js3.p(str, ConfirmDTO.INPUT_TYPE_TEXT);
        js3.p(paint, "paint");
        paint.getTextBounds(str, i, i2, this.d);
        a(f, f2, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawTextRun(MeasuredText measuredText, int i, int i2, int i3, int i4, float f, float f2, boolean z, Paint paint) {
        js3.p(measuredText, ConfirmDTO.INPUT_TYPE_TEXT);
        js3.p(paint, "paint");
        paint.getTextBounds(measuredText.toString(), i, i2, this.d);
        a(f, f2, paint);
    }

    @Override // android.graphics.Canvas
    public final boolean quickReject(float f, float f2, float f3, float f4, Canvas.EdgeType edgeType) {
        js3.p(edgeType, "type");
        return b().quickReject(f, f2, f3, f4, edgeType);
    }

    @Override // android.graphics.Canvas
    public final boolean clipRect(float f, float f2, float f3, float f4) {
        return b().clipRect(f, f2, f3, f4);
    }

    @Override // android.graphics.Canvas
    public final boolean quickReject(float f, float f2, float f3, float f4) {
        return b().quickReject(f, f2, f3, f4);
    }

    @Override // android.graphics.Canvas
    public final boolean clipRect(int i, int i2, int i3, int i4) {
        return b().clipRect(i, i2, i3, i4);
    }

    @Override // android.graphics.Canvas
    public final void drawBitmap(Bitmap bitmap, Rect rect, RectF rectF, Paint paint) {
        js3.p(bitmap, "bitmap");
        js3.p(rectF, "dst");
        int iD = d(bitmap, paint, rect);
        Paint paint2 = this.b;
        paint2.setColor(iD);
        paint2.setColorFilter(null);
        b().drawRect(rectF, paint2);
    }

    @Override // android.graphics.Canvas
    public final void drawPicture(Picture picture, Rect rect) {
        js3.p(picture, "picture");
        js3.p(rect, "dst");
        Paint paint = this.b;
        paint.setColorFilter(null);
        paint.setColor(-16777216);
        b().drawRect(rect, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawRect(float f, float f2, float f3, float f4, Paint paint) {
        js3.p(paint, "paint");
        BitmapShader bitmapShaderC = c(paint);
        b().drawRect(f, f2, f3, f4, paint);
        paint.setShader(bitmapShaderC);
    }

    @Override // android.graphics.Canvas
    public final void drawText(CharSequence charSequence, int i, int i2, float f, float f2, Paint paint) {
        js3.p(charSequence, ConfirmDTO.INPUT_TYPE_TEXT);
        js3.p(paint, "paint");
        paint.getTextBounds(charSequence.toString(), 0, charSequence.length(), this.d);
        a(f, f2, paint);
    }

    @Override // android.graphics.Canvas
    public final int saveLayer(float f, float f2, float f3, float f4, Paint paint, int i) {
        BitmapShader bitmapShaderC = c(paint);
        int iSaveLayer = b().saveLayer(f, f2, f3, f4, paint, i);
        if (paint == null) {
            return iSaveLayer;
        }
        paint.setShader(bitmapShaderC);
        return iSaveLayer;
    }

    @Override // android.graphics.Canvas
    public final int saveLayer(float f, float f2, float f3, float f4, Paint paint) {
        BitmapShader bitmapShaderC = c(paint);
        int iSaveLayer = b().saveLayer(f, f2, f3, f4, paint);
        if (paint == null) {
            return iSaveLayer;
        }
        paint.setShader(bitmapShaderC);
        return iSaveLayer;
    }

    @Override // android.graphics.Canvas
    public final void drawBitmap(Bitmap bitmap, Rect rect, Rect rect2, Paint paint) {
        js3.p(bitmap, "bitmap");
        js3.p(rect2, "dst");
        int iD = d(bitmap, paint, rect);
        Paint paint2 = this.b;
        paint2.setColor(iD);
        paint2.setColorFilter(null);
        b().drawRect(rect2, paint2);
    }

    @Override // android.graphics.Canvas
    public final void drawBitmap(Bitmap bitmap, Matrix matrix, Paint paint) {
        js3.p(bitmap, "bitmap");
        js3.p(matrix, "matrix");
        int iD = d(bitmap, paint, null);
        Paint paint2 = this.b;
        paint2.setColor(iD);
        paint2.setColorFilter(null);
        int iSave = b().save();
        b().setMatrix(matrix);
        b().drawRect(0.0f, 0.0f, bitmap.getWidth(), bitmap.getHeight(), paint2);
        b().restoreToCount(iSave);
    }
}
