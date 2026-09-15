package adt.linkedList.batch;

import adt.linkedList.DoubleLinkedListImpl;
import adt.linkedList.DoubleLinkedListNode;
import util.GenericException;

/**
 * Manipula elementos da LinkedList em bloco (batch).
 * 
 * ATENÇÃO: NAO MODIFIQUE NENHUMA OUTRA CLASSE ALEM DESTA !!!!! 
 * 
 * @author campelo
 * @author adalberto
 *
 * @param <T>
 */
public class BatchLinkedListImpl<T> extends DoubleLinkedListImpl<T> implements BatchLinkedList<T> {

	/* 
	 * Nao modifique nem remova este metodo.
	 */
	public BatchLinkedListImpl() {
		head = new DoubleLinkedListNode<T>();
		last = (DoubleLinkedListNode<T>)head;
	}

	@Override
	public void inserirEmBatch(int posicao, T[] elementos) throws GenericException {
		// TODO IMPLEMENTAR seguindo a documentação da interface e remover a linha abaixo
		throw new UnsupportedOperationException("Not implemented yet!");
	}

	@Override
	public void removerEmBatch(int posicao, int quantidade) throws GenericException {
		// TODO IMPLEMENTAR seguindo a documentação da interface e remover a linha abaixo
		throw new UnsupportedOperationException("Not implemented yet!");
	}
	
}
