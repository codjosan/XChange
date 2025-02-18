package dto.trade;

import java.math.BigDecimal;
import java.util.Date;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.knowm.xchange.dto.account.OpenPosition;
import org.knowm.xchange.instrument.Instrument;

@Getter
@Setter
@ToString(callSuper = true)
public class BybitComplexPositionChanges extends OpenPosition {

  private int positionIdx;
  private int tradeMode;
  private int riskId;
  private String riskLimitValue;
  private BigDecimal markPrice;
  private BigDecimal positionBalance;
  private int autoAddMargin;
  private BigDecimal positionMM;
  private BigDecimal positionIM;
  private BigDecimal bustPrice;
  private BigDecimal positionValue;
  private BigDecimal leverage;
  private BigDecimal takeProfit;
  private BigDecimal stopLoss;
  private BigDecimal trailingStop;
  private BigDecimal curRealisedPnl;
  private BigDecimal cumRealisedPnl;
  private BigDecimal sessionAvgPrice; // USDC contract session avg price
  private String positionStatus;
  private int adlRankIndicator;
  private boolean isReduceOnly;
  private String mmrSysUpdatedTime;
  private String leverageSysUpdatedTime;
  private Date createdTime;
  private Date updatedTime;
  private long seq;

  public BybitComplexPositionChanges(
      Instrument instrument,
      Type type,
      BigDecimal size,
      BigDecimal liquidationPrice,
      BigDecimal unRealisedPnl,
      BigDecimal positionValue,
      BigDecimal entryPrice,
      BigDecimal leverage,
      BigDecimal takeProfit,
      BigDecimal stopLoss,
      BigDecimal curRealisedPnl,
      BigDecimal cumRealisedPnl,
      Date createdTime,
      Date updatedTime,
      long seq) {
    super(instrument, type, size, entryPrice, liquidationPrice, unRealisedPnl);
    this.positionValue = positionValue;
    this.leverage = leverage;
    this.takeProfit = takeProfit;
    this.stopLoss = stopLoss;
    this.curRealisedPnl = curRealisedPnl;
    this.cumRealisedPnl = cumRealisedPnl;
    this.createdTime = createdTime;
    this.updatedTime = updatedTime;
    this.seq = seq;
  }

  public BybitComplexPositionChanges(
      Instrument instrument,
      Type type,
      BigDecimal size,
      BigDecimal price,
      BigDecimal liquidationPrice,
      BigDecimal unRealisedPnl) {
    super(instrument, type, size, price, liquidationPrice, unRealisedPnl);
    if (size.compareTo(BigDecimal.ZERO) != 0 && price.compareTo(BigDecimal.ZERO) != 0) {
      this.positionValue = size.multiply(price);
    } else {
      this.positionValue = BigDecimal.ZERO;
    }
  }

  public BybitComplexPositionChanges(BybitComplexPositionChanges changes) {
    super(
        changes.getInstrument(),
        changes.getType(),
        changes.getSize(),
        changes.getPrice(),
        changes.getLiquidationPrice(),
        changes.getUnRealisedPnl());
    this.positionIdx = changes.positionIdx;
    this.tradeMode = changes.tradeMode;
    this.riskId = changes.riskId;
    this.riskLimitValue = changes.riskLimitValue;
    this.markPrice = changes.markPrice;
    this.positionBalance = changes.positionBalance;
    this.autoAddMargin = changes.autoAddMargin;
    this.positionMM = changes.positionMM;
    this.positionIM = changes.positionIM;
    this.bustPrice = changes.bustPrice;
    this.positionValue = changes.positionValue;
    this.leverage = changes.leverage;
    this.takeProfit = changes.takeProfit;
    this.stopLoss = changes.stopLoss;
    this.trailingStop = changes.trailingStop;
    this.curRealisedPnl = changes.curRealisedPnl;
    this.cumRealisedPnl = changes.cumRealisedPnl;
    this.sessionAvgPrice = changes.sessionAvgPrice;
    this.positionStatus = changes.positionStatus;
    this.adlRankIndicator = changes.adlRankIndicator;
    this.isReduceOnly = changes.isReduceOnly;
    this.mmrSysUpdatedTime = changes.mmrSysUpdatedTime;
    this.leverageSysUpdatedTime = changes.leverageSysUpdatedTime;
    this.createdTime = changes.createdTime;
    this.updatedTime = changes.updatedTime;
    this.seq = changes.seq;
  }

  public BybitComplexPositionChanges(
      Instrument instrument,
      Type type,
      BigDecimal size,
      BigDecimal price,
      BigDecimal liquidationPrice,
      BigDecimal unRealisedPnl,
      int positionIdx,
      int tradeMode,
      int riskId,
      String riskLimitValue,
      BigDecimal markPrice,
      BigDecimal positionBalance,
      int autoAddMargin,
      BigDecimal positionMM,
      BigDecimal positionIM,
      BigDecimal bustPrice,
      BigDecimal positionValue,
      BigDecimal leverage,
      BigDecimal takeProfit,
      BigDecimal stopLoss,
      BigDecimal trailingStop,
      BigDecimal curRealisedPnl,
      BigDecimal cumRealisedPnl,
      BigDecimal sessionAvgPrice,
      String positionStatus,
      int adlRankIndicator,
      boolean isReduceOnly,
      String mmrSysUpdatedTime,
      String leverageSysUpdatedTime,
      Date createdTime,
      Date updatedTime,
      long seq) {
    super(instrument, type, size, price, liquidationPrice, unRealisedPnl);
    this.positionIdx = positionIdx;
    this.tradeMode = tradeMode;
    this.riskId = riskId;
    this.riskLimitValue = riskLimitValue;
    this.markPrice = markPrice;
    this.positionBalance = positionBalance;
    this.autoAddMargin = autoAddMargin;
    this.positionMM = positionMM;
    this.positionIM = positionIM;
    this.bustPrice = bustPrice;
    this.positionValue = positionValue;
    this.leverage = leverage;
    this.takeProfit = takeProfit;
    this.stopLoss = stopLoss;
    this.trailingStop = trailingStop;
    this.curRealisedPnl = curRealisedPnl;
    this.cumRealisedPnl = cumRealisedPnl;
    this.sessionAvgPrice = sessionAvgPrice;
    this.positionStatus = positionStatus;
    this.adlRankIndicator = adlRankIndicator;
    this.isReduceOnly = isReduceOnly;
    this.mmrSysUpdatedTime = mmrSysUpdatedTime;
    this.leverageSysUpdatedTime = leverageSysUpdatedTime;
    this.createdTime = createdTime;
    this.updatedTime = updatedTime;
    this.seq = seq;
  }
}
