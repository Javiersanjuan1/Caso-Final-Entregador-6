import java.util.*;

// Clase para representar una transacción de venta
class Transaction {
    private String productName;
    private double amount;

    public Transaction(String productName, double amount) {
        this.productName = productName;
        this.amount = amount;
    }

    public String getProductName() {
        return productName;
    }

    public double getAmount() {
        return amount;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "productName='" + productName + '\'' +
                ", amount=" + amount +
                '}';
    }
}

public class Anali
    public static void main(String[] args) {
        // Lista de transacciones de venta
        List<Transaction> transactions = new ArrayList<>();
        transactions.add(new Transaction("Producto A", 100.0));
        transactions.add(new Transaction("Producto B", 50.0));
        transactions.add(new Transaction("Producto C", 75.0));

        // Ordenar las transacciones por nombre del producto utilizando TreeSet
        TreeSet<Transaction> sortedTransactionsByName = new TreeSet<>(Comparator.comparing(Transaction::getProductName));
        sortedTransactionsByName.addAll(transactions);

        System.out.println("Transacciones ordenadas por nombre del producto:");
        for (Transaction transaction : sortedTransactionsByName) {
            System.out.println(transaction);
        }

        // Ordenar las transacciones por monto utilizando Collections.sort
        Collections.sort(transactions, Comparator.comparing(Transaction::getAmount));

        System.out.println("\nTransacciones ordenadas por monto:");
        for (Transaction transaction : transactions) {
            System.out.println(transaction);
        }

        // Búsqueda de una transacción por nombre del producto utilizando binarySearch
        String productNameToSearch = "Producto B";
        Transaction searchKey = new Transaction(productNameToSearch, 0);
        int index = Collections.binarySearch(transactions, searchKey, Comparator.comparing(Transaction::getProductName));

        if (index >= 0) {
            System.out.println("\nTransacción encontrada: " + transactions.get(index));
        } else {
            System.out.println("\nTransacción no encontrada para el producto: " + productNameToSearch);
        }
    }
}