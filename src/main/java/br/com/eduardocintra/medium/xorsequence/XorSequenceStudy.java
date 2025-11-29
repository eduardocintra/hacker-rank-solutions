package br.com.eduardocintra.medium.xorsequence;

public class XorSequenceStudy {
  public static void main(String[] args) {

    int size = 90;
    int[] arr = new int[size + 1];

    for (int i = 0; i < size; i++) {
      int xor = getAcumulate(i);
      arr[i] = xor;

      final String ANSI_GREEN = "\033[32m";
      final String ANSI_RESET = "\033[0m";

      int acumulateXor = getAcumulate(arr);
      int calculatedXor = calculateXor(i);

      if (acumulateXor == calculatedXor) {
        System.out.println(
            ANSI_GREEN
                + "i = "
                + format(i, 2)
                + "\txor = "
                + format(xor, 2)
                + "\t0^"
                + format(xor, 2)
                + " = "
                + format(acumulateXor, 2)
                + "\tmod 8 = "
                + format((i % 8), 2)
                + "\t my xor = "
                + format(calculatedXor, 2)
                + ANSI_RESET);
      } else {
        System.out.println(
            "i = "
                + format(i, 2)
                + "\txor = "
                + format(xor, 2)
                + "\t0^"
                + format(xor, 2)
                + " = "
                + format(acumulateXor, 2)
                + "\tmod 8 = "
                + format((i % 8), 2)
                + "\t my xor = "
                + format(calculatedXor, 2));
      }
      if ((xor > 0) && xor % 8 == 0) {
        System.out.println("---------------------------------------------------------------");
      }
    }
  }

  private static int calculateXor(int num) {
    int rem = num % 8;

    if (rem == 0 || rem == 1) return num;
    if (rem == 2 || rem == 3) return 2;
    if (rem == 4 || rem == 5) return num + 2;
    return 0;
  }

  private static int getAcumulate(int[] arr) {
    int acumulator = 0;
    for (int i = 0; i < arr.length; i++) {
      acumulator = acumulator ^ arr[i];
    }

    return acumulator;
  }

  private static int getAcumulate(int n) {
    int acumulator = 0;
    for (int i = 0; i <= n; i++) {
      acumulator = acumulator ^ i;
    }

    return acumulator;
  }

  private static String format(int number, int size) {
    return String.format("%" + size + "s", number);
  }
}
