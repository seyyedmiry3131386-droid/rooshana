package defpackage;

import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import java.io.FileNotFoundException;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class nw extends tc4 {
    public final /* synthetic */ int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ nw(ContentResolver contentResolver, Uri uri, boolean z, int i) {
        super(contentResolver, uri, z);
        this.e = i;
    }

    @Override // defpackage.tc4
    public final void a(Object obj) throws IOException {
        switch (this.e) {
            case 0:
                ((AssetFileDescriptor) obj).close();
                break;
            default:
                ((ParcelFileDescriptor) obj).close();
                break;
        }
    }

    @Override // defpackage.tc4
    public final Object b(ContentResolver contentResolver, Uri uri) throws FileNotFoundException {
        switch (this.e) {
            case 0:
                boolean z = this.a;
                ContentResolver contentResolver2 = this.c;
                AssetFileDescriptor assetFileDescriptorH = (z && r3.g(uri) && r3.f()) ? r3.h(contentResolver2, uri) : contentResolver2.openAssetFileDescriptor(uri, "r");
                if (assetFileDescriptorH != null) {
                    return assetFileDescriptorH;
                }
                throw new FileNotFoundException(rm7.p(uri, "FileDescriptor is null for: "));
            default:
                boolean z2 = this.a;
                ContentResolver contentResolver3 = this.c;
                AssetFileDescriptor assetFileDescriptorH2 = (z2 && r3.g(uri) && r3.f()) ? r3.h(contentResolver3, uri) : contentResolver3.openAssetFileDescriptor(uri, "r");
                if (assetFileDescriptorH2 != null) {
                    return assetFileDescriptorH2.getParcelFileDescriptor();
                }
                throw new FileNotFoundException(rm7.p(uri, "FileDescriptor is null for: "));
        }
    }

    @Override // defpackage.la1
    public final Class getDataClass() {
        switch (this.e) {
            case 0:
                return AssetFileDescriptor.class;
            default:
                return ParcelFileDescriptor.class;
        }
    }
}
