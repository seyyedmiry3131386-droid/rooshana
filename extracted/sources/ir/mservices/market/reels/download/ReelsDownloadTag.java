package ir.mservices.market.reels.download;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public final class ReelsDownloadTag implements Serializable {
    public static final long serialVersionUID = 100;

    private final void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.readInt();
    }

    private final void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.writeInt(1);
    }
}
