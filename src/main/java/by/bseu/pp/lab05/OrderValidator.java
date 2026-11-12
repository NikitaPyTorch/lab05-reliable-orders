package by.bseu.pp.lab05;

public final class OrderValidator {
    private OrderValidator() { }

    /** null и пустой/пробельный id: ValidationException; сообщение содержит id. */
    public static void validateId(String id) {
        if (id == null || id.isBlank()) {
            throw new ValidationException("Некорректный id заказа: значение должно быть непустым");
        }
    }

    /** Только конечное число > 0; ошибка содержит amount и переданное значение. */
    public static void validateAmount(double amount) {
        if (!Double.isFinite(amount) || amount <= 0) {
            throw new ValidationException("Некорректная сумма amount=" + Double.toString(amount)
                    + ": требуется конечное число больше 0");
        }
    }
}
