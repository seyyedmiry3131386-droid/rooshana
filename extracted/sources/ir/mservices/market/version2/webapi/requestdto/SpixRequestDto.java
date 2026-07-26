package ir.mservices.market.version2.webapi.requestdto;

import ir.mservices.market.pika.common.model.SpixPikaRequestDto;
import ir.mservices.market.version2.webapi.responsedto.RequestDTO;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public class SpixRequestDto implements RequestDTO, Serializable {
    private SpixUrlCallbackRequestDto callbackData;
    private SpixDownloadRequestDto downloadData;
    private SpixInstallRequestDto installData;
    private SpixMovieDownloadRequestDto movieDownload;
    private SpixPaymentRequestDto paymentData;
    private SpixPikaRequestDto pikaData;
    private SpixPlayerRequestDto playerData;
    private SpixSpeedControlRequestDto speedControl;
    private final SpixUserRequestDto user;

    public SpixRequestDto(SpixUserRequestDto spixUserRequestDto, SpixMovieDownloadRequestDto spixMovieDownloadRequestDto) {
        this.user = spixUserRequestDto;
        this.movieDownload = spixMovieDownloadRequestDto;
    }

    public SpixRequestDto(SpixUserRequestDto spixUserRequestDto, SpixInstallRequestDto spixInstallRequestDto) {
        this.user = spixUserRequestDto;
        this.installData = spixInstallRequestDto;
    }

    public SpixRequestDto(SpixUserRequestDto spixUserRequestDto, SpixPlayerRequestDto spixPlayerRequestDto) {
        this.user = spixUserRequestDto;
        this.playerData = spixPlayerRequestDto;
    }

    public SpixRequestDto(SpixUserRequestDto spixUserRequestDto, SpixPaymentRequestDto spixPaymentRequestDto) {
        this.user = spixUserRequestDto;
        this.paymentData = spixPaymentRequestDto;
    }

    public SpixRequestDto(SpixUserRequestDto spixUserRequestDto, SpixDownloadRequestDto spixDownloadRequestDto) {
        this.user = spixUserRequestDto;
        this.downloadData = spixDownloadRequestDto;
    }

    public SpixRequestDto(SpixUserRequestDto spixUserRequestDto, SpixPikaRequestDto spixPikaRequestDto) {
        this.user = spixUserRequestDto;
        this.pikaData = spixPikaRequestDto;
    }

    public SpixRequestDto(SpixUserRequestDto spixUserRequestDto, SpixUrlCallbackRequestDto spixUrlCallbackRequestDto) {
        this.user = spixUserRequestDto;
        this.callbackData = spixUrlCallbackRequestDto;
    }

    public SpixRequestDto(SpixUserRequestDto spixUserRequestDto, SpixSpeedControlRequestDto spixSpeedControlRequestDto) {
        this.user = spixUserRequestDto;
        this.speedControl = spixSpeedControlRequestDto;
    }
}
