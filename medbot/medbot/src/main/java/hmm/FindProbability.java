/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hmm;

import java.text.DecimalFormat;


public class FindProbability {
    
    public double findProbability(double[][] M,int N, int F, int S, int T)
    {
        // Storing M^T in MT
        double[][] MT = matrix_power(M, T, N);
        
        double val= MT[F - 1][S - 1];
        val=Double.parseDouble(new DecimalFormat("##.##").format(val));
 
        // Returning the answer
        return val;
        
    }
    
     static double[][] matrix_power(double[][] M, int p, int n)
    {
        double[][] A = new double[n][n];
        for (int i = 0; i < n; ++i)
            A[i][i] = 1;
 
        while (p > 0)
        {
            if (p % 2 == 1)
                A = multiply(A, M, n);
            M = multiply(M, M, n);
            p /= 2;
        }
        return A;
    }
     
      static double[][] multiply(double[][] A,
            double[][] B, int N)
    {
        double[][] C = new double[N][N];
        for (int i = 0; i < N; ++i)
            for (int j = 0; j < N; ++j)
                for (int k = 0; k < N; ++k)
                    C[i][j] += A[i][k] * B[k][j];
        return C;
    }
    
}
